package com.wgcisotto.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DbSingletonTest {

    @Test
    public void run(){
        DbSingleton instance = DbSingleton.getInstance();
        System.out.println(instance);
        DbSingleton anotherInstance = DbSingleton.getInstance();
        System.out.println(anotherInstance);

        assertEquals(instance, anotherInstance);
    }


}