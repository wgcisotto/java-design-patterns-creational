package com.wgcisotto.creational.singleton;

//eagely loaded
public class DbSingleton {

    private DbSingleton(){}

    // not lazying load or thread safe
    private static DbSingleton instance = new DbSingleton();

    public static DbSingleton getInstance() {
        return instance;
    }
}
