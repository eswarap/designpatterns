package org.learningpath.designpatterns.payment;

public class Cash implements PaymentMethod {
    @Override
    public void pay(int paise) {
        System.out.format("Paid ",paise);
    }
}

