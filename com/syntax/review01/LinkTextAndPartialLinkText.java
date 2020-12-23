package com.syntax.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextAndPartialLinkText {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        navigate to HRMS web application
        driver.get("http://hrmstest.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

//        login HRMS
//        enter username
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
//        enter password
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
//        click on login button
        driver.findElement(By.id("btnLogin")).click();

        Thread.sleep(5000);

//        click on performance button
        driver.findElement(By.linkText("Performance")).click();

//        partialLinkText()

//        driver.findElement(By.linkText("Recruitment")).click();

//        partialLinkText() --> is the part of original LinkText when it is a long one

        driver.findElement(By.partialLinkText("Recruitme")).click();

    }
}
