package com.dam1;

public class Main {

    public static void main(String[] args) {
            Pizzas build = new BuilderPizzas()
                    .setCebolla(true)
                    .setChampiñones(true)
                    .build();
        System.out.println(build.toString());
    }
}
