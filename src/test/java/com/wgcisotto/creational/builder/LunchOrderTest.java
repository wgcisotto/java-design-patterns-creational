package com.wgcisotto.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LunchOrderTest {

    @Test
    public void createLunchOrderBean(){
        LunchOrderBean lunchOrderBean = new LunchOrderBean();

        lunchOrderBean.setBread("Wheat");
        lunchOrderBean.setCondiments("Lettuce");
        lunchOrderBean.setDressing("Mustard");
        lunchOrderBean.setMeat("Ham");

        assertEquals("Wheat", lunchOrderBean.getBread());
        assertEquals("Lettuce", lunchOrderBean.getCondiments());
        assertEquals("Mustard", lunchOrderBean.getDressing());
        assertEquals("Ham", lunchOrderBean.getMeat());
    }

    @Test
    public void createLunchOrderTelescope(){
        LunchOrderTelescope lunchOrder = new LunchOrderTelescope("Wheat", "Lettuce",
                "Mustard", "Ham");

        assertEquals("Wheat", lunchOrder.getBread());
        assertEquals("Lettuce", lunchOrder.getCondiments());
        assertEquals("Mustard", lunchOrder.getDressing());
        assertEquals("Ham", lunchOrder.getMeat());
    }

    @Test
    public void createLunchOrderBuilder(){
        final LunchOrderBuilder lunchOrder = new LunchOrderBuilder.Builder()
                .bread("Wheat")
                .condiments("Lettuce")
                .dressing("Mustard")
                .meat("Ham")
                .build();


        assertEquals("Wheat", lunchOrder.getBread());
        assertEquals("Lettuce", lunchOrder.getCondiments());
        assertEquals("Mustard", lunchOrder.getDressing());
        assertEquals("Ham", lunchOrder.getMeat());
    }

    @Test
    public void createLunchOrderBuilderLikeLombok(){
        final LunchOrderBuilderLikeLombok lunchOrder = LunchOrderBuilderLikeLombok.builder()
                .bread("Wheat")
                .condiments("Lettuce")
                .dressing("Mustard")
                .meat("Ham")
                .build();

        assertEquals("Wheat", lunchOrder.getBread());
        assertEquals("Lettuce", lunchOrder.getCondiments());
        assertEquals("Mustard", lunchOrder.getDressing());
        assertEquals("Ham", lunchOrder.getMeat());
    }




}