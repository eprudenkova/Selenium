package com.syntax.review01;

public class XpathRecap {
    public static void main(String[] args) {
//        Xpath --> absolute (Native)
//              --> Relative

       String absolutePath = "/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[1]/div/div/select";

//       Relative xpath
//        Syntax for basics xpath --> //tagName[@attribute='attributeValue']
//                                --> //tagName[text()='textValue']

        String relXpath = "//select[@id='searchDropdownBox']";

        //b[text()='PIM']
        //a[text()='Entitlements']
        //input[id$='-pickup')]


    }
}
