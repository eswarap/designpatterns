package org.woven.examples.payment;

public class PaymentSimulator {

    public static void main(String[] args) {
        Card card = new CreditCard("John Doe", "4111111111111111", "123", "01/22");
        card.executeTransaction(10);
    }
}
