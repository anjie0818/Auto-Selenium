package com.selenium.demo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class APIDemo {
    public static void main(String[] args) throws InterruptedException {
        //初始化一个chrome浏览器实例driver
        WebDriver driver = new ChromeDriver();

        // get(url)打开一个网站
//        driver.get("https://www.baidu.com");
        driver.navigate().to("http://www.ahic.com.cn");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        /**
         * 操作浏览器
         */
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();
//        driver.getTitle();
//        driver.getCurrentUrl();
        //操作滚动条，转为js对象，执行js代码
//        JavascriptExecutor jsdriver = (JavascriptExecutor) driver;
//        jsdriver.executeScript("window.scrollTo(0,document.body.scrollHeight)\n");
        driver.findElement(By.linkText("登录")).click();
        /**
         * 登录操作
         * Sendkeys()
         * clear()
         * getText()
         * Click()
         */
        driver.findElement(By.id("mobilenohide")).click();
        driver.findElement(By.id("mobile_r")).sendKeys("0200002272");
        driver.findElement(By.id("passnohide")).click();
        driver.findElement(By.id("passWord")).sendKeys("aa00000");
        driver.findElement(By.className("btn")).click();
        Set<Cookie> allCookies = driver.manage().getCookies();
        for (Cookie c:allCookies
             ) {
            System.out.println(c.getName()+"-"+c.getDomain());
        }
        Thread.sleep(2000);
        //点击车险新保--DDB
        driver.switchTo().frame(driver.findElement(By.name("myLeft")));
        driver.findElement(By.xpath("//*[@id=\"newAuto\"]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"ddbAuto\"]")).click();
        //投保录入
        driver.switchTo().defaultContent();
        //单选框操作
        /**
         * 单选框/下拉框/复选框
         */
        //关闭并退出浏览器
        Thread.sleep(2000L);
//        driver.close();//完全关闭
    }
}
