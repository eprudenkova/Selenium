package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();//launch the browser
        driver.get("http://syntaxtechs.com");// navigate to url
        String url = driver.getCurrentUrl();// getting url
        System.out.println(url);
        String title = driver.getTitle();//getting title of thr page
        System.out.println(title);


        driver.close();

    }
}
