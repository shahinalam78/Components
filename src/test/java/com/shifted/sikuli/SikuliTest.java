package com.shifted.sikuli;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class SikuliTest {

    WebDriver driver;

    @Test
    public void sikuliTest() throws FindFailed {

        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://www.youtube.com/watch?v=5zcVultnwq8");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Screen sc = new Screen();

        Pattern playImg = new Pattern("C:\\MyDev\\Components\\PicturesYoutube\\PlayImg.png");
        sc.wait(playImg, 2000);
        sc.click(playImg);

        Pattern settingImg = new Pattern("C:\\MyDev\\Components\\PicturesYoutube\\SettingImg.png");
        sc.click(settingImg);
        sc.click();

    }

    @Test
    public void fbTest() throws FindFailed {

        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://www.yahoo.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        Screen sc = new Screen();

        Pattern playImg = new Pattern("MAIL.png");
        sc.wait(playImg, 2000);
        sc.click(playImg);

        /*Pattern settingImg = new Pattern("C:\\MyDev\\Components\\PicturesYoutube\\SettingImg.png");
        sc.click();
        sc.click();*/

    }

    @Test
    public void test() throws FindFailed {

        ChromeDriverManager.getInstance().setup();

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.youtube.com/watch?v=5zcVultnwq8");

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        Screen sc = new Screen();

        Pattern pt = new Pattern("C:\\MyDev\\Components\\PicturesYoutube\\SettingImg.png");

        sc.click(pt);


        Pattern ptt = new Pattern("C:\\Users\\PaxoStudent\\Desktop\\Pictures");

        sc.click(ptt);


        //sc.click();
    }
}