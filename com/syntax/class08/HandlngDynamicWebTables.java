package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlngDynamicWebTables {

    static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/login.aspx";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");

        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

        WebElement login = driver.findElement(By.id("ctl00_MainContent_login_button"));
        login.click();

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));//storing all the rws in the List

        for (int i = 0; i < rows.size(); i++) {//starting to loop over list based on the size
            String rowText=rows.get(i).getText();//getting text of list
            System.out.println(rowText);

            if(rowText.contains("Bob Feather")) {//setting a condition to click on vheckBox
                //get the rows of first column in the table
                driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[1]")).get(i-1).click();
                //locating all the checkBoxes ang grabbing a single row checkBox and click in
                break;
            }
        }
        Thread.sleep(8000);
        driver.close();
    }
}
