package DesignPatterns.builder;

public class Main {
    public static void main(String[] args) {

        Product product = new Product.ProductBuilder()
                .id(10L)
                .name("name")
                .description("description")
                .build();

        Product product2 = new Product.ProductBuilder()
                .id(11L)
                .name("name2")
                .description("description2")
                .inStock(true)
                .build();
        System.out.println(product2);
        System.out.println(product);

    }
}
