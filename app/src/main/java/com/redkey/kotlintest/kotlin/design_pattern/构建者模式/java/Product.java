package com.redkey.kotlintest.kotlin.design_pattern.构建者模式.java;

public class Product {

    private String mPartA;
    private String mPartB;
    private String mPartC;

    public static class Builder {

        Product mProduct;

        public Builder() {
            this.mProduct = new Product();
        }

        public Builder buildPartA(String partA) {
            this.mProduct.mPartA = partA;
            return this;
        }

        public Builder buildPartB(String partB) {
            this.mProduct.mPartB = partB;
            return this;
        }

        public Builder buildPartC(String partC) {
            this.mProduct.mPartC = partC;
            return this;
        }

        public Product build() {
            return mProduct;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "mPartA='" + mPartA + '\'' +
                ", mPartB='" + mPartB + '\'' +
                ", mPartC='" + mPartC + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Product product = new Product.Builder()
                .buildPartA("a")
                .buildPartB("b")
                .buildPartC("c")
                .build();

        System.out.println(product.toString());
    }

}