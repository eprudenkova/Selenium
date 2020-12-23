package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingDropDown {
    public static String url = "http://syntaxtechs.com/selenium-practice/basic-select-dropdown-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement daysDD = driver.findElement(By.id("select-demo"));//locate the dropdown
        Select select = new Select(daysDD);//create an obj of the Select Class
//        select by index
        select.selectByIndex(2);//Monday

        Thread.sleep(1000);

//        select by visible text
        select.selectByVisibleText("Wednesday");//Wednesday

        Thread.sleep(1000);

//        select by value
        select.selectByValue("Sunday");//Sunday


        List<WebElement> allOptions = select.getOptions();
        System.out.println("Number of options in the DD: " + allOptions.size());//7+1=8 blank is option

        for (int i = 0; i < allOptions.size(); i++) {

            String optionText = allOptions.get(i).getText();
            System.out.println(optionText);
            select.selectByIndex(i);
            Thread.sleep(1000);

        }

        driver.quit();
    }
}
