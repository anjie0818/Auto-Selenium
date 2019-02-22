package com.selenium.muke;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

/**
 * @创建人 anjie
 * @创建时间 2019/2/19
 * @描述
 */
public class MukeLoginScript {
    private WebDriver driver;

    public MukeLoginScript(WebDriver driver) {
        this.driver = driver;
    }

    public void goLogin(String username, String password) throws InterruptedException, IOException {
        driver.navigate().to("https://www.imooc.com/");
        //初始化一个chrome浏览器实例driver
        Thread.sleep(2000);
        WebElement toLoginButton = element(GetByLocator.getLocator("toLoginButton"));
        toLoginButton.click();
        Thread.sleep(2000);
        WebElement mobileInput = element(GetByLocator.getLocator("mobileInput"));
        mobileInput.sendKeys(username);
        WebElement passwordInput = element(GetByLocator.getLocator("passwordInput"));
        passwordInput.sendKeys(password);
        Thread.sleep(3000);
        WebElement loginButton =element(GetByLocator.getLocator("loginButton"));
        loginButton.click();
        Thread.sleep(2000);
        WebElement hoverButton =element(GetByLocator.getLocator("hoverButton"));
        //光标浮动
        Actions action=new Actions(driver);
        action.moveToElement(hoverButton).perform();
        Thread.sleep(2000);
        WebElement nameInput = element(GetByLocator.getLocator("nameInput"));
        System.out.println(nameInput.getText());
        //退出
        WebElement outlogin=element(GetByLocator.getLocator("outlogin"));
        outlogin.click();
        Thread.sleep(3000);
    }
    public WebElement element(By by){
        return driver.findElement(by);
    }
}
