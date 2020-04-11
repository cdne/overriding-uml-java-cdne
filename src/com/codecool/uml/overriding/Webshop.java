package com.codecool.uml.overriding;

public class Webshop {

    public static void main(String[] args) {
        PaymentProcess paymentProcess = new PaymentProcess();
        CheckoutProcess checkoutProcess = new CheckoutProcess();
        System.out.println("\nMaking a new order");

        Order order1 = new Order();
        checkoutProcess.process(order1);
        paymentProcess.process(order1);
        //        Display order status

        System.out.println("Order with id: " + order1.getId() + " is " + order1.getStatus());

        System.out.println("\nMaking a new order");

        Order order2 = new Order();
        checkoutProcess.process(order2);

        //        Display order status
        System.out.println("Order with id: " + order2.getId() + " is " + order2.getStatus());

        System.out.println("\nMaking a new order");
        Order order3 = new Order();
        System.out.println("Order with id: " + order3.getId() + " is " + order3.getStatus());


    }
}
