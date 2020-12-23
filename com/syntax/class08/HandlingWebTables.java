package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class HandlingWebTables {

    static String url = "http://syntaxtechs.com/selenium-practice/table-search-filter-demo.php";
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

//        //table[@id='task-table']/tbody/tr

        System.out.println("---------Row Data---------");

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id= 'task-table']/tbody/tr"));
        System.out.println("Number of rows: " + rows.size());

        Iterator<WebElement> it = rows.iterator();
        while (it.hasNext()) {
            String rowText = it.next().getText();
            System.out.println(rowText);
        }

        System.out.println("---------Header---------");

//        //table[@id= 'task-table']/thead/tr/th"

        List<WebElement> colsData = driver.findElements(By.xpath("//table[@id= 'task-table']/thead/tr/th"));
        System.out.println("Number of columns: " + colsData.size());

        for (WebElement col : colsData) {
            String colText = col.getText();
            System.out.print(colText+" ");
        }
        Thread.sleep(6000);
        driver.close();
    }
}



