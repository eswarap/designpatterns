package org.woven.examples.payment;

public class Cash implements PaymentMethod {
    @Override
    public void pay(int paise) {
        System.out.format("Paid ",paise);
    }
}

