package com.hutingyu;

public class App {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        double result = c.eval(args[0], args[1], args[2]);
        System.out.println(result);
    }
}