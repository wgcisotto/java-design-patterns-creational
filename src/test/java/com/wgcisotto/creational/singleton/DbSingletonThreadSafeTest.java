package com.wgcisotto.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DbSingletonThreadSafeTest {

    @Test
    public void run(){
        DbSingletonThreadSafe instance = DbSingletonThreadSafe.getInstance();
        System.out.println(instance);
        DbSingletonThreadSafe anotherInstance = DbSingletonThreadSafe.getInstance();
        System.out.println(anotherInstance);

        assertEquals(instance, anotherInstance);
    }

}