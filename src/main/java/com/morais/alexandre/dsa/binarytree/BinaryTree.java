package com.morais.alexandre.dsa.binarytree;

public class BinaryTree<T extends Comparable<T>> {

    private BinNode<T> root;
  
    public BinaryTree() {
      this.root = null;
    }
  
    public void add(T content) {
      BinNode<T> newNode = new BinNode<>(content);
      this.root = add(root, newNode);
    }
  
    private BinNode<T> add(BinNode<T> current, BinNode<T> newNode) {
      if (current == null) {
        return newNode;
      } else if (newNode.getContent().compareTo(current.getContent()) < 0) {
        current.setLeftBinNode(add(current.getLeftBinNode(), newNode));
      } else {
        current.setRightBinNode(add(current.getRightBinNode(), newNode));
      }
  
      return current;
    }
  
    public void showInOrdem() {
      System.out.println("In Ordem");
      showInOrdem(this.root);
    }
  
    private void showInOrdem(BinNode<T> current) {
      if (current != null) {
        showInOrdem(current.getLeftBinNode());
        System.out.print(current.getContent() + ", ");
        showInOrdem(current.getRightBinNode());
      }
    }
  
    public void showPosOrdem() {
      System.out.println("\n Pos Ordem");
      showPosOrdem(this.root);
    }
  
    private void showPosOrdem(BinNode<T> current) {
      if (current != null) {
        showPosOrdem(current.getLeftBinNode());
        showPosOrdem(current.getRightBinNode());
        System.out.print(current.getContent() + ", ");
      }
    }
  
    public void showPreOrdem() {
      System.out.println("\n Pre Ordem");
      showPreOrdem(this.root);
    }
  
    private void showPreOrdem(BinNode<T> current) {
      if (current != null) {
        System.out.print(current.getContent() + ", ");
        showPreOrdem(current.getLeftBinNode());
        showPreOrdem(current.getRightBinNode());
      }
    }
  
    public void remove(T content) {
      try {
        BinNode<T> current = this.root;
        BinNode<T> parent = null;
        BinNode<T> child = null;
        BinNode<T> temp = null;
  
        while (current != null && !current.getContent().equals(content)) {
          parent = current;
          if (content.compareTo(current.getContent()) < 0) {
            current = current.getLeftBinNode();
          } else {
            current = current.getRightBinNode();
          }
        }
  
        if (current == null) {
          System.out.println("Conteeudo não encontrado. Bloco try");
        }
  
        if (parent == null) {
          if (current.getRightBinNode() == null) {
            this.root = current.getLeftBinNode();
          } else if (current.getLeftBinNode() == null) {
            this.root = current.getRightBinNode();
          } else {
            for (temp = current, child = current.getLeftBinNode(); child
                .getRightBinNode() != null; temp = child, child = child.getLeftBinNode()) {
              if (child != current.getLeftBinNode()) {
                temp.setRightBinNode(child.getLeftBinNode());
                child.setLeftBinNode(root.getLeftBinNode());
              }
            }
            child.setRightBinNode(root.getRightBinNode());
            root = child;
          }
  
        } else if (current.getRightBinNode() == null) {
          if (parent.getLeftBinNode() == current) {
            parent.setLeftBinNode(current.getLeftBinNode());
          } else {
            parent.setRightBinNode(current.getLeftBinNode());
          }
        } else if (current.getLeftBinNode() == null) {
          if (parent.getLeftBinNode() == current) {
            parent.setLeftBinNode(current.getRightBinNode());
          } else {
            parent.setRightBinNode(current.getRightBinNode());
          }
        } else {
          for (temp = current, child = current.getLeftBinNode(); child
              .getRightBinNode() != null; temp = child, child = child.getRightBinNode()) {
            if (child != current.getLeftBinNode()) {
              temp.setRightBinNode(child.getLeftBinNode());
              child.setLeftBinNode(current.getLeftBinNode());
            }
            child.setRightBinNode(current.getRightBinNode());
            if (parent.getLeftBinNode() == current) {
              parent.setLeftBinNode(child);
            } else {
              parent.setRightBinNode(child);
            }
          }
        }
  
      } catch (NullPointerException erro) {
        System.out.println("Conteudo não encontrado. Bloco catch");
      }
    }
  }
  