package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvancedWindowHandle {

    public static String url = "http://syntaxtechs.com/selenium-practice/window-popup-modal-demo.php";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        String mainPageHandle = driver.getWindowHandle();

        WebElement instaButton = driver.findElement(By.linkText("Follow On Instagram"));
        WebElement fbButton = driver.findElement(By.linkText("Like us On Facebook"));
        WebElement instaAndFbButton = driver.findElement(By.linkText("Follow Instagram & Facebook"));

        instaButton.click();
        fbButton.click();
        instaAndFbButton.click();

        Set<String> allWindowHandles = driver.getWindowHandles();//use Set<> because no duplicates
        System.out.println("Size: " + allWindowHandles.size());//4
        Iterator<String> it = allWindowHandles.iterator();

        while (it.hasNext()) {//start iterating through handles
            String handle = it.next();// get the next handle

            if (!handle.equals(mainPageHandle)) {//set a condition
                driver.switchTo().window(handle);//switch to a window witch is not equal to parent handle
                System.out.println("Title of page: " + driver.getTitle());
                driver.close();
                Thread.sleep(2000);
            }
        }
        driver.switchTo().window(mainPageHandle);//switch back to parent
        instaButton.click();
    }
}
