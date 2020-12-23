package com.syntax.class07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {

//    navigate to http://www.uitestpractice.com/Students/Contact
//    click on the link
//    get text
//    print out in the console

    static String url = "http://www.uitestpractice.com/Students/Contact";

    public static void main(String[] args) {
        System.setProperty("wedriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
//        need to maximize the window, otherwise you will get a ElementClickInterceptedException

        driver.manage().window().maximize();

//        we need to find parent handle first and than iterate

        driver.quit();
    }
}
