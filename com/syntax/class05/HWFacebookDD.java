package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HWFacebookDD {
//    TC 1: Facebook dropdown verification
//    Open chrome browser
//    Go to "https://www.facebook.com"
//    Verify:
//    month dd has 12 month options
//    day dd has 31 day options
//    year dd has 115 year options
//    Select your date of birth
//    Quit browser

    public static String url = "http://www.facebook.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();

//        MONTH
        WebElement monthDD = driver.findElement(By.xpath("//select[contains(@id,'month')]"));
        Select select = new Select(monthDD);
        List<WebElement> options = select.getOptions();
        int sizeMonth = options.size();
        System.out.println(sizeMonth);//12
        if(sizeMonth==12){
            System.out.println("Month DD has 12 month option");
        }else{
            System.out.println("Month DD INCORRECT");
        }
        for (WebElement option:
             options) {
            String textToSelect = "oct";
            if(option.isEnabled() && textToSelect.equalsIgnoreCase(textToSelect)) {
                select.selectByVisibleText(textToSelect);
                break;
            }else{
                System.out.println(textToSelect+" does not exist");
            }
        }
//        DAY
//        WebElement dayDD = driver.findElement(By.name("//select[@name='birthday_day']"));
//        Select selectDay = new Select (dayDD);
//        List<WebElement> optionsDay = selectDay.getOptions();
//        int sizeDay = optionsDay.size();
//        if(sizeDay==31){
//            System.out.println("Day DD has 31 day option");
//        }else{
//            System.out.println("Day DD INCORRECT");
//        }
//        for (WebElement optionDay:optionsDay
//             ) {
//            String textToSelect = "4";
//            if(optionDay.isEnabled() && textToSelect.equalsIgnoreCase("4")){
//                selectDay.selectByValue("4");
//                break;
//            }else{
//                System.out.println(textToSelect+" does not exist");
//            }
//        }
        driver.quit();
    }
}
