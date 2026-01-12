package org.skypro.skyshop.product;

import java.util.Objects;

public abstract class Product {
    private final String productName;
    public abstract int getPrice();

    public Product(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return this.productName;
    }

    public abstract boolean isSpecial();


    @Override
    public abstract String toString();
}
