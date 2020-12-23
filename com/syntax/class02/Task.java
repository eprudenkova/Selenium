package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    /*
    Navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
login
get title and verify
logout
close browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.className("button")).click();

        Thread.sleep(1000);

        String actualTitle = driver.getTitle();
        String expectingTitle = "Web Orders";
        if(actualTitle.equalsIgnoreCase(expectingTitle)){
            System.out.println("The title is right");
        }else{
            System.out.println("The title is wrong");
        }

        driver.findElement(By.partialLinkText("Logout"));
        Thread.sleep(2000);
        driver.quit();
        Thread.sleep(2000);


    }
}
