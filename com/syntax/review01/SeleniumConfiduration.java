package com.syntax.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumConfiduration {
    public static void main(String[] args) throws InterruptedException {

//        Set Properties for our webdriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
//        Create an object of WebDriver interface
        WebDriver driver = new ChromeDriver();

//        ChromeDriver (BrowserDriver) extends RemoteWebDriver
//        RemoteWedDriver implements WebDriver

//        Navigate to specified web application

//        driver.get("http://www.amazon.com/");
        String amazonUrl = "http://www.amazon.com/";
        driver.get(amazonUrl);

        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        String expTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";

        String actTitle = driver.getTitle();
        System.out.println(actTitle);

        if(expTitle.equals(actTitle)){
            System.out.println("test PASS");
        }else{
            System.out.println("test FAIL");
        }

        String handle = driver.getWindowHandle();
        System.out.println(handle);

        Thread.sleep(2000);

        driver.close();
        driver.quit();
    }

}
