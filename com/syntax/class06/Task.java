package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.PanelUI;

public class Task {

//    Task
//    Navigate to http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php
//    verify the header text Syntax Technologies -......
//    verify enroll today button is enabled

    public static String url = "http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.switchTo().frame("FrameOne");

        WebElement frameElement = driver.findElement(By.xpath("//a[text() = 'SYNTAX TECHNOLOGIES ']"));
        boolean isHeaderDisplayed = frameElement.isDisplayed();
        System.out.println("Is header displayed? " + isHeaderDisplayed);

        driver.switchTo().defaultContent();

        WebElement secondFrame = driver.findElement(By.xpath("//iframe[@name = 'FrameTwo']"));
        driver.switchTo().frame(secondFrame);

        Thread.sleep(1000);

        WebElement enrollTodayButton = driver.findElement(By.xpath("//a[text() = 'Enroll Today']"));
        boolean isEnrollTodayEnabled = enrollTodayButton.isEnabled();
        System.out.println("Is Enroll Today Enabled? " + isEnrollTodayEnabled);
        enrollTodayButton.click();

        driver.quit();

    }
}
