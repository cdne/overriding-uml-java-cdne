package com.codecool.uml.overriding;

public class Order implements Orderable{
    private int id;
    private String status;


    public String getStatus(){
        return "";
    }

    @Override
    public boolean checkout() {
        return false;
    }

    @Override
    public boolean pay() {
        return false;
    }
}
