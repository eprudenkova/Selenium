package com.syntax.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.jvm.hotspot.debugger.cdbg.BaseClass;

public class AuthenticationAlert {

    public static String url = "http://test:test@abcdatabase.com/basicauth";
                                    //username:password@
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

//        BaseClass.setUpBrowser();
//
//        /**
//         * // Actual URL --> http://abcdatabase.com/basicauth
//         * userName = test
//         * password = test
//         */
//        // web site with popping up box for userName and password
//        BaseClass.driver.get("http://test:test@abcdatabase.com/basicauth");

    }
}
