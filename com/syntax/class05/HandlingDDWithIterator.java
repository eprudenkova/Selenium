package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class HandlingDDWithIterator {
    public static String url = "http://www.amazon.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement categoriesDD = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(categoriesDD);

        List<WebElement> options = select.getOptions();

        Iterator<WebElement> iterator = options.iterator();

        while (iterator.hasNext()) {
            WebElement option = iterator.next();
            String text = option.getText();
            System.out.println(text);
        }
        boolean isMultiple = select.isMultiple();
        System.out.println(isMultiple);//false
        Thread.sleep(2000);

        driver.quit();
    }
}
