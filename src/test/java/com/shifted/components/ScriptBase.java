package com.shifted.components;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by PaxoStudent on 12/22/2017.
 */
public class ScriptBase {

    WebDriver driver;
  @BeforeMethod
    public void setUp() throws InterruptedException {

        ChromeDriverManager.getInstance().setup();
         driver = new ChromeDriver();

        driver.navigate().to("https://www.lordandtaylor.com/");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement frame = driver.findElement(By.xpath("//*[@id=\"generic-modal\"]/iframe"));
        driver.switchTo().frame(frame);
        Thread.sleep(5000);

        WebElement closeButton = driver.findElement(By.xpath("//*[@id='close-button']"));
        closeButton.click();

    }

    @AfterMethod
    public void tearDown(){

    }
}
