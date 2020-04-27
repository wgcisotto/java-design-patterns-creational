package com.wgcisotto.creational.abstractfactory;

public class AmexGoldValidator extends Validator {

    @Override
    boolean isValid(CreditCard creditCard) {
        return false;
    }

}
