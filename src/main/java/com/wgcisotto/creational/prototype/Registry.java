package com.wgcisotto.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<Itens, Item> items  = new HashMap<Itens, Item>();

    public Registry(){
        loadItems();
    }

    public Item createItem(Itens type){
        Item item = null;
        try {
            item = (Item)(items.get(type)).clone();

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems(){
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(24.99);
        movie.setRuntime("2 hours");
        items.put(Itens.MOVIE, movie);

        Book book = new Book();
        book.setTitle("Basic Books");
        book.setPrice(19.99);
        book.setNumberOfPages(335);
        items.put(Itens.BOOK, book);

    }

}
