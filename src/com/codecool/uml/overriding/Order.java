package com.codecool.uml.overriding;

public class Order implements Orderable{
    private static int counter;
    private int id;
    private String status;

    Order(){
        id = counter++;
        status = "in cart";
    }

    public String getStatus(){
        return status;
    }

    public int getId(){return id;}

    @Override
    public boolean checkout() {
        System.out.println("Order is in checkout");
        this.status = "in checkout";
        return true;
    }

    @Override
    public boolean pay() {
        System.out.println("Order is paid");
        this.status = "paid";
        return true;
    }
}
