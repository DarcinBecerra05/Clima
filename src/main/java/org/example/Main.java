package org.example;


public class Main {
    public static void main(String[] args) {
        try {
            Ejecucion.comenzar();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
