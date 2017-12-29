package com.shifted.components;


import org.testng.annotations.Test;

/**
 * Created by PaxoStudent on 12/22/2017.
 */
public class LordAndTaylorBasicTest extends ScriptBase {


    @Test
    public void test() {
        String title = driver.getTitle();
        System.out.println("Lord & Taylor Title Is: " + title);

        String url = driver.getCurrentUrl();
        System.out.println(url);
    }

    @Test
    public void test2(){


    }

}
