package list;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new ArrayList<>();
    }

    public void addItem(String name, BigDecimal price, int amount){
        shoppingCart.add(new Item(name, price, amount));
    }

    public void removeItemByName(String name){
        List<Item> removeItems = new ArrayList<>();
        for(Item i: shoppingCart){
            if(i.getName().equalsIgnoreCase(name)){
                removeItems.add(i);
            }
        }

        shoppingCart.removeAll(removeItems);
    }

    public void showItems(){
        System.out.println(shoppingCart);
    }

    public void shoppingCartTotal(){
        BigDecimal total = new BigDecimal("0.0");
        for(Item i: shoppingCart){
            total = total.add(i.totalItem());
        }
        System.out.println(total.toString());
    }

    public static void main(String[] args) {
        ShoppingCart myShoppingCart = new ShoppingCart();

        myShoppingCart.addItem("Maçã", new BigDecimal("3.90"), 2);
        myShoppingCart.addItem("Banana", new BigDecimal("4.50"), 3);
        myShoppingCart.addItem("Café", new BigDecimal("13.90"), 2);
        myShoppingCart.addItem("Leite", new BigDecimal("4.75"), 1);

        System.out.println("Itens no carrinho:");
        myShoppingCart.showItems();

        System.out.println("Valor da compra:");
        myShoppingCart.shoppingCartTotal();

        System.out.println("Removendo item...");
        myShoppingCart.removeItemByName("Leite");

        System.out.println("Valor atualizado da compra:");
        myShoppingCart.shoppingCartTotal();
    }
}
