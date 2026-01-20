package com.generics.dynamiconlinemarketplace;


import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {

 private List<Product<? extends Category>> products = new ArrayList<>();

 public void addProduct(Product<? extends Category> product) {
     products.add(product);
 }

 public void showCatalog() {
	    for (int i = 0; i < products.size(); i++) {
	        System.out.println(products.get(i));
	    }
	}

}
