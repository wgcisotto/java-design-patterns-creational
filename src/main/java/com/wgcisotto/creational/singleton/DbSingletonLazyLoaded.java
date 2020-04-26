package com.wgcisotto.creational.singleton;

import java.util.Objects;

public class DbSingletonLazyLoaded {

    private DbSingletonLazyLoaded(){}

    private static DbSingletonLazyLoaded instance = null;

    public static DbSingletonLazyLoaded getInstance() {
        if(Objects.isNull(instance)){
            instance = new DbSingletonLazyLoaded();
        }
        return instance;
    }

}
