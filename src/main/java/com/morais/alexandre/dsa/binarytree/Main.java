package com.morais.alexandre.dsa.binarytree;

import com.morais.alexandre.dsa.binarytree.model.Obj;

public class Main {
  public static void main(String[] args) {
    BinaryTree<Obj> myBinaryTree = new BinaryTree<>();

    myBinaryTree.add(new Obj(13));
    myBinaryTree.add(new Obj(10));
    myBinaryTree.add(new Obj(25));
    myBinaryTree.add(new Obj(2));
    myBinaryTree.add(new Obj(12));
    myBinaryTree.add(new Obj(20));
    myBinaryTree.add(new Obj(31));
    myBinaryTree.add(new Obj(29));

    myBinaryTree.showInOrdem();
    myBinaryTree.showPosOrdem();
    myBinaryTree.showPreOrdem();
  }
}
