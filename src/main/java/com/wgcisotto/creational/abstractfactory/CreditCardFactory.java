package com.wgcisotto.creational.abstractfactory;

//AbstractFactory
public abstract class CreditCardFactory {

    public static final int SCORE = 650;

    public static CreditCardFactory getCreditCardFactory(int creditScore){

        if(creditScore > SCORE){
            return new AmexFactory();
        }else{
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
