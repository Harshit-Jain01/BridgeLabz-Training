package com.collectionsframework.shoppingcart;


public class UseShoppingCart{

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Laptop", 55000);
        cart.addProduct("Mouse", 500);
        cart.addProduct("Keyboard", 1200);
        cart.addProduct("Monitor", 12000);

        cart.displayProducts();
        cart.displayInsertionOrder();
        cart.displaySortedByPrice();
        
    }
}
