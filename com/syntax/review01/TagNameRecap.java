package com.syntax.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagNameRecap {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        find out how many links available on amazon.com and find how many of them is not empty
//        and print all non-empty links

        driver.get("http://www.amazon.com");

//        findElement() -- findElements()
//        returns one element -- returns List<WebElement>
//        NoSuchElementException -- empty list
//        returns the first accurance -- returns List<WebElement>

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Number of links: " + links.size());

        Thread.sleep(2000);

        int count = 0;
        int emptyCount = 0;

        for (WebElement link : links) {

            if (!link.getText().isEmpty()) {
                count++;
                System.out.println(link.getText());
            }else{
                emptyCount++;
            }
        }
        System.out.println("Number of non-empty links: "+count);
        System.out.println("Number of empty links: "+emptyCount);

        driver.quit();

        }
    }
