package com.day1.optionalclass.ecommerce;


import java.util.Optional;

public class OptionalEcommerceDemo {

    public static void main(String[] args) {

        Product product = new Product(
                501,
                "Laptop",
                null,                 // discount not available
                null,                 // coupon not available
                "ABC Electronics",
                null,                 // description missing
                "Flipkart Logistics"
        );

        // 1. Apply default discount if product discount is missing
        double discount = Optional.ofNullable(product.discount)
                .orElse(5.0);
        System.out.println("Discount Applied: " + discount + "%");

        // 2. Fetch coupon code if present, otherwise skip discount logic
        Optional.ofNullable(product.couponCode)
                .ifPresent(code ->
                        System.out.println("Coupon Applied: " + code));

        // 3. Display seller details safely
        String seller = Optional.ofNullable(product.sellerDetails)
                .orElse("Seller information not available");
        System.out.println("Seller: " + seller);

        // 4. Return default description if missing
        String description = Optional.ofNullable(product.description)
                .orElse("No description available");
        System.out.println("Description: " + description);

        // 5. Fetch delivery partner info safely
        Optional.ofNullable(product.deliveryPartner)
                .ifPresent(d ->
                        System.out.println("Delivery Partner: " + d));
    }
}
