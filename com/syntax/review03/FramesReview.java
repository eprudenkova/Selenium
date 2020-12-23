package com.syntax.review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesReview {
    public static String url = "https://the-internet.herokuapp.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Frames")).click();
        driver.findElement(By.linkText("iFrame")).click();

//        we need to switch to the frame
//        id or name or WE or index

        driver.switchTo().frame("mce_0_ifr");
        WebElement textBox = driver.findElement(By.xpath("//body[@id = 'tinymce']"));
        textBox.clear();
        textBox.sendKeys("Hello");

        Thread.sleep(1000);

//        switching back to the main window
        driver.switchTo().defaultContent();
        boolean isDisplayed = driver.findElement(By.xpath("//img[contains(@alt, 'Fork')]")).isDisplayed();
        if (isDisplayed) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }
        Thread.sleep(1000);
        driver.quit();
    }
}
