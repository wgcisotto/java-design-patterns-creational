package com.wgcisotto.creational.singleton;

import java.util.Objects;

public class DbSingletonThreadSafe {

    private static volatile DbSingletonThreadSafe instance = null;

    private DbSingletonThreadSafe(){
        if(instance != null){
            throw  new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbSingletonThreadSafe getInstance() {
        if(Objects.isNull(instance)){
            synchronized (DbSingletonThreadSafe.class){
                if(Objects.isNull(null)){
                    instance = new DbSingletonThreadSafe();
                }
            }
        }
        return instance;
    }

}
