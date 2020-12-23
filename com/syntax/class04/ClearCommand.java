package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearCommand {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");
        WebElement userNameTextBox = driver.findElement(By.xpath("//input[contains(@id, 'username')]"));
        userNameTextBox.sendKeys("Tester");
        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@type = 'password']"));
        passwordTextBox.sendKeys("test");

        Thread.sleep(2000);

        userNameTextBox.clear();
        Thread.sleep(2000);

        passwordTextBox.clear();
        Thread.sleep(2000);

        driver.quit();
    }
}
