package com.generics.dynamiconlinemarketplace;

public class UseMarketPlace

 {

    public static void main(String[] args) {

        Product<BookCategory> book =
                new Product<>("Effective Java", 550, new BookCategory());

        Product<ClothingCategory> jeans =
                new Product<>("Jeans", 1800, new ClothingCategory());

        Product<GadgetCategory> laptop =
                new Product<>("Laptop", 65000, new GadgetCategory());

        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(laptop, 5);

        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book);
        catalog.addProduct(jeans);
        catalog.addProduct(laptop);

        catalog.showCatalog();
    }
}
