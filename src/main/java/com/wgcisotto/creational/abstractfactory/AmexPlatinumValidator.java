package com.wgcisotto.creational.abstractfactory;

public class AmexPlatinumValidator implements Validator {

    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
