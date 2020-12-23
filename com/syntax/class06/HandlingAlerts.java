package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

//      SIMPLE ALERT
        WebElement simpleAlertButton = driver.findElement(By.id("alert"));
        simpleAlertButton.click();
        Thread.sleep(1000);
        //switch focus on alert box
        //return one alert object and store in Alert variable
        Alert simpleAlert = driver.switchTo().alert();
//        handling simple alert
        simpleAlert.accept();


//        CONFIRMATION ALERT
        WebElement confirmAlertButton = driver.findElement(By.id("confirm"));
        confirmAlertButton.click();
        Thread.sleep(1000);
        Alert confirmAlert = driver.switchTo().alert();
//        handling confirmation alert
        String confirmText = confirmAlert.getText();
        System.out.println("This is confirm Alert Text: "+confirmText);
        Thread.sleep(1000);
        confirmAlert.dismiss();

//      PROMPT ALERT
        WebElement promptAlertButton = driver.findElement(By.id("confirm"));
        promptAlertButton.click();
        Thread.sleep(1000);
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("Syntax techs");
        promptAlert.accept();


        driver.quit();
    }
}
