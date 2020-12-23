package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HW1 {

//    HW
//    Go to https://demoqa.com/browser-windows
//    click on New Tab and print the text from new tab in the console
//    click on New Window and print the text from new window in the console
//    click on New Window Message and print the text from new window in the console
//    Verify the title is displayed
//    Print out the title of the all pages

    static String url = "https://demoqa.com/browser-windows";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        String mainPageHandle = driver.getWindowHandle();//getting current window handle
        WebElement buttonNewTab = driver.findElement(By.id("tabButton"));
        buttonNewTab.click();

        driver.getWindowHandle();
        WebElement text = driver.findElement(By.id("sampleHeading"));
        System.out.println(text.getText());
//
//        Set<String> allWindowHandle = driver.getWindowHandles();
//        System.out.println("Size: " + allWindowHandle.size());
//
//        Iterator<String> iterator = allWindowHandle.iterator();
//
//        while (iterator.hasNext()) {
//            String handle = iterator.next();
//            driver.switchTo().window(handle);
//            System.out.println("Title: "+driver.getTitle());
//        }
        driver.quit();
    }
}
