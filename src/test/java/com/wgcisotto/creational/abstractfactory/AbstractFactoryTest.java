package com.wgcisotto.creational.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest {

    @Test
    public void run(){

        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(651);

        final CreditCard amecCreditCardPlatinum = abstractFactory.getCreditCard(CardType.PLATINUM);

        assertEquals(AmexPlatinumCreditCard.class, amecCreditCardPlatinum.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);

        final CreditCard visaCreditCardGold = abstractFactory.getCreditCard(CardType.GOLD);

        assertEquals(VisaGoldCreditCard.class, visaCreditCardGold.getClass());



    }

}