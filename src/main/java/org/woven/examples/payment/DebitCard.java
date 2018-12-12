package org.woven.examples.payment;


public class DebitCard extends Card {
    public DebitCard(String nameOnCard, String number, String cvv, String expirationDate) {
        super(nameOnCard, number, cvv, expirationDate);
    }

    @Override
    public void pay(int paise) {
        super.pay(paise);
    }

    @Override
    protected String getType() {
        return "DEBIT";
    }

    @Override
    protected void executeTransaction(int paise) {
        System.out.format("Executed transaction on",paise);
    }
}
