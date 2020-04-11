package com.codecool.uml.overriding;

public class CheckoutProcess extends AbstractProcess {

    @Override
    protected void action(Orderable item) {
        System.out.println(item.checkout());
    }
}
