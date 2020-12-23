package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");//set our properties
        WebDriver driver = new ChromeDriver();//launch browser
        driver.get("http://fb.com");
        driver.findElement(By.id("email")).sendKeys("syntax");// email1 --> error: NoSuchElementException last line where (LocatingElements.java:12)
        driver.findElement(By.id("pass")).sendKeys("syntax123");
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);//thread class belongs Java not Selenium
//        driver.findElement(By.linkText("Forgotten Password?")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();

        Thread.sleep(3000);
        driver.quit();
    }

}
