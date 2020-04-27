package com.wgcisotto.creational.abstractfactory;

public abstract class CreditCard {

    protected int cardNumberLength;

    protected int csNumber;

    public int getCardNumberLength() {
        return cardNumberLength;
    }

    public void setCardNumberLength(int cardNumberLength) {
        this.cardNumberLength = cardNumberLength;
    }

    public int getCsNumber() {
        return csNumber;
    }

    public void setCsNumber(int csNumber) {
        this.csNumber = csNumber;
    }

}
