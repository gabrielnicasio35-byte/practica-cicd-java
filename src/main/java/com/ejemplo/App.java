package com.ejemplo;

public class App {
    public int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Resultado de la suma: " + app.sumar(5, 3));
    }
}