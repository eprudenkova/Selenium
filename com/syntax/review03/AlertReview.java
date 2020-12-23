package com.syntax.review03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertReview {
    public static String url = "https://the-internet.herokuapp.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

//        SIMPLE ALERT
        driver.findElement(By.linkText("JavaScript Alerts")).click();
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        String expectedAlertText = "I Am a JS Alert";
        Alert alert = driver.switchTo().alert();
        String alertTextFromApp = alert.getText();
        if (alertTextFromApp.equalsIgnoreCase(expectedAlertText)) {
            System.out.println("Right Alert is present. Test pass.");
        } else {
            System.out.println("Not valid text on the alert. Test fail.");
        }
        alert.accept();

//        CONFIRMATION ALERT
        driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
        driver.switchTo().alert();
        alert.dismiss();

//            PROMPT ALERT
        driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();

        driver.switchTo().alert();
        String sendText = "Hello From Batch 8";
        alert.sendKeys(sendText);
        alert.accept();

        String enteredText = driver.findElement(By.id("result")).getText();
        System.out.println(enteredText);
        String[] textArray = enteredText.split(":");

        if(textArray[1].trim().equals(sendText)){
            System.out.println("Test Pass");
        }else{
            System.out.println("Test fail");
        }

        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

        driver.quit();
    }
}

