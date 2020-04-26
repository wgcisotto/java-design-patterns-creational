package com.wgcisotto.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DbSingletonLazyLoadedTest {

    @Test
    public void run(){
        DbSingletonLazyLoaded instance = DbSingletonLazyLoaded.getInstance();
        System.out.println(instance);
        DbSingletonLazyLoaded anotherInstance = DbSingletonLazyLoaded.getInstance();
        System.out.println(anotherInstance);

        assertEquals(instance, anotherInstance);
    }

}