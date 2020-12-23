package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

//        BY INDEX
        driver.switchTo().frame(0);
        WebElement textBox = driver.findElement(By.id("name"));
        textBox.sendKeys("2020 sucks!");

        driver.switchTo().defaultContent();//after this we will be able interact with the elements on the webpage

        WebElement alertButton = driver.findElement(By.id("alert"));
        alertButton.click();
        driver.switchTo().frame("iframe_a");
        textBox.clear();
        textBox.sendKeys("hello");

        driver.switchTo().defaultContent();

//        By WebElement
        WebElement frameElement = driver.findElement(By.xpath("//iframe[@src = '/Demo.html']"));
        driver.switchTo().frame(frameElement);
        textBox.clear();
        textBox.sendKeys("Get coffee!");

//        // By Name or ID
//        driver.switchTo().frame("iframe_a"); //switch method is used to switch to a frame
//        name.clear();
//        name.sendKeys("Tom");
//        driver.switchTo().defaultContent();
//
//
//        // By WebElement
//        WebElement firstFrame = driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
//        driver.switchTo().frame(firstFrame);
//        name.clear();
//        name.sendKeys("Asel");
//        driver.switchTo().defaultContent();
    }
}
