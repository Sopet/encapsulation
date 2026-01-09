package org.skypro.skyshop.product;

import java.util.Objects;

public class Product {
    private final String productName;
    private final int costOfTheProduct;

    public Product(String productName, int costOfTheProduct) {
        this.productName = productName;
        this.costOfTheProduct = costOfTheProduct;
    }

    public String getProductName() {
        return this.productName;
    }
    public int getCostOfTheProduct() {
        return this.costOfTheProduct;
    }
}