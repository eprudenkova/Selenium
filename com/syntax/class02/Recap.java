package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");//set our properties
        WebDriver driver = new ChromeDriver();//launch browser
        driver.get("http://facebook.com");
        driver.manage().window().maximize();
//        driver.manage().window().fullscreen();
        String title = driver.getTitle();
        if(title.equalsIgnoreCase("Facebook - log in or sign up")){
            System.out.println("Right");
        }else{
            System.out.println("Wrong");
        }
    }
}
