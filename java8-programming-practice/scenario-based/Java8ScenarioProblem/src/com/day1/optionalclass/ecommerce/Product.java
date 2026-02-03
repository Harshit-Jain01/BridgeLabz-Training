package com.day1.optionalclass.ecommerce;


public class Product {

    int productId;
    String productName;
    Double discount;          
    String couponCode;        
    String sellerDetails;     
    String description;      
    String deliveryPartner;  

    public Product(int productId, String productName, Double discount,
                   String couponCode, String sellerDetails,
                   String description, String deliveryPartner) {
        this.productId = productId;
        this.productName = productName;
        this.discount = discount;
        this.couponCode = couponCode;
        this.sellerDetails = sellerDetails;
        this.description = description;
        this.deliveryPartner = deliveryPartner;
    }
}
