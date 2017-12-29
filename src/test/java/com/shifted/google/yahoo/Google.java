package com.shifted.google.yahoo;


import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Google {

    @Test
    public void test1() throws InterruptedException {

        ChromeDriverManager.getInstance().setup();

        //System.setProperty("webdriver.chrome.driver","C:\\MyDev\\Components\\src\\main\\java\\drivers\\32\\CH\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://accounts.google.com/signin");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String titel = driver.getTitle();
        System.out.println(titel);

        WebElement emailField = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        emailField.sendKeys("mdalam7841@gmail.com");

        WebElement emailnextButton = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content"));
        emailnextButton.click();

        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(passwordField));

        passwordField.sendKeys("shift786");
        Thread.sleep(3000);

        WebElement passwordnextButton = driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span"));
        passwordnextButton.click();

        String text =  driver.findElement(By.xpath(".//*[@id='yDmH0d']/div[2]/c-wiz/div/div/div[5]/div[2]/c-wiz/div/div[1]/div/div[2]")).getText();
        Assert.assertEquals("Welcome, Md Alam",text);

        WebElement logOutLink = driver.findElement(By.xpath(".//*[@id='gb']/div[2]/div[3]/div/div[2]/div/a/span"));
        logOutLink.click();

        WebElement logOutButton = driver.findElement(By.xpath(".//*[@id='gb']/div[2]/div[6]/div[4]/div[2]"));
        logOutButton.click();
        Thread.sleep(3000);

        driver.close();
    }
}
