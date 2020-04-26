package com.wgcisotto.creational.prototype;

import org.junit.jupiter.api.Test;

class RegistryTest {

    @Test
    public void run(){
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem(Itens.MOVIE);
        movie.setTitle("Creational Patterns in java");

        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        Movie anotherMovie = (Movie) registry.createItem(Itens.MOVIE);
        anotherMovie.setTitle("Gang of Four");

        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getRuntime());
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getUrl());

    }

}