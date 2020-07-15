package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Util{
    BrowserManage browserManage=new BrowserManage();
    @BeforeMethod
    public void OpenBrowser(){
        browserManage.setUpWebBrowser();
    }
    @AfterMethod
    public void CloseBrowser(){
        browserManage.closeBrowser();
    }
}