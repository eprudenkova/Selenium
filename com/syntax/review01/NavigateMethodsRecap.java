package com.syntax.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethodsRecap {

    public static void main(String[] args) throws InterruptedException {

//        navigate() methods --> keeps our browsing history and enables us to specific page or
//        navigate back and forward ...

//        Set Properties for our webdriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
//        Create an object of WebDriver interface
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

//        .navigate().to(String URL)

//        navigate to ebay
//        driver.navigate().to("https://www.ebay.com/");
        String ebayUrl = "https://www.ebay.com/";
        driver.navigate().to(ebayUrl);

        Thread.sleep(2000);

//        navigate to amazon
        driver.navigate().to("https://www.amazon.com/");

//        navigate back to ebay
        driver.navigate().back();

//        get title and url of the current web page and

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: "+currentUrl);

        String currentTitle = driver.getTitle();

        Thread.sleep(2000);

        driver.navigate().forward();

        Thread.sleep(2000);

        driver.navigate().refresh();

        driver.close();


    }
}
