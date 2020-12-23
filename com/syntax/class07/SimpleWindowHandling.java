package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindowHandling {

    public static String url = "https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        String mainPageHandle = driver.getWindowHandle();//getting current window handle
        System.out.println("Parent handle: " + mainPageHandle);
        WebElement helpLink = driver.findElement(By.linkText("Help"));
        helpLink.click();

//        How to get window handle?
//        In Selenium we have two methods to get the hand of window
//        1. getWindowHandle() - to get main window
//        2. getWindowHandle() - to iterate all open windows, all windows opened with this webdriver
//        getWindowHandles returns Set of string IDs of all currently opened by current instance

        Set<String> allWindowHandles = driver.getWindowHandles();//will automatically return LinkedHashSet
//        we don't need to convert it to LinkedHashSet

        System.out.println("Size: " + allWindowHandles.size());//2
        Iterator<String> it = allWindowHandles.iterator();//creating iterator in order to iterate through windows
        mainPageHandle = it.next();//stepping forward to thr parent page; Returns the id of Main Window
        String childHandle = it.next();//stepping forward to the child page; Returns the id of Child Window
        System.out.println("Child handle: " + childHandle);

        Thread.sleep(1000);
        driver.switchTo().window(mainPageHandle);//switching back to parent page

        Thread.sleep(1000);
        driver.close();//close last window
        driver.quit();
    }
}
