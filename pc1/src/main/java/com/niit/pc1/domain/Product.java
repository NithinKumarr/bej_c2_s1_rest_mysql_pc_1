package com.niit.pc1.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
private int productId;
    private String productName;
    private String productDescripition;
    private int amountInStock;
    public Product(){

    }

    public Product(int productId, String productName, String productDescripition, int amountInStock) {
        this.productId = productId;
        this.productName = productName;
        this.productDescripition = productDescripition;
        this.amountInStock = amountInStock;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescripition() {
        return productDescripition;
    }

    public void setProductDescripition(String productDescripition) {
        this.productDescripition = productDescripition;
    }

    public int getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(int amountInStock) {
        this.amountInStock = amountInStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productDescripition='" + productDescripition + '\'' +
                ", amountInStock=" + amountInStock +
                '}';
    }
}
