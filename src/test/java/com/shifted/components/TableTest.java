package com.shifted.components;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TableTest {

    @Test
    public void test(){

        ChromeDriverManager.getInstance().setup();

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("");

        driver.findElement(By.xpath(""));

    }
}
