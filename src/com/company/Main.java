package com.company;

public class Main {

    public static void main(String[] args) {
        Cook cook = new Cook();
        Consumer consumer = new Consumer();
        consumer.orderDish(cook);
    }
}
