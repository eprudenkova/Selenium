package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/basic-radiobutton-demo.php");
        WebElement ageRadioButton = driver.findElement(By.xpath("//input[@value = '0 - 5']"));
        boolean isEnabled = ageRadioButton.isEnabled();
        boolean isDisplayed = ageRadioButton.isDisplayed();
        System.out.println(isEnabled);
        System.out.println(isDisplayed);

        Thread.sleep(2000);
        System.out.println("Before clicking "+ ageRadioButton.isSelected());//false
        Thread.sleep(2000);
        ageRadioButton.click();
        System.out.println("After clicking "+ageRadioButton.isSelected());//true

        driver.quit();
    }
}
