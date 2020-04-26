package com.wgcisotto.creational.factory;

import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteFactoryTest {

    @Test
    public void run(){
        Website website = WebsiteFactory.getWebsite(WebsiteType.BLOG);

        System.out.println(website.getPages());
        assertEquals(4, website.getPages().size());

        website = WebsiteFactory.getWebsite(WebsiteType.SHOP);

        System.out.println(website.getPages());
        assertEquals(3, website.getPages().size());
    }
}