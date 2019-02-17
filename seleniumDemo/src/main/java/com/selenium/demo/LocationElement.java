package com.selenium.demo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocationElement {
    public static void main(String[] args) throws InterruptedException {
        //初始化一个chrome浏览器实例driver
        WebDriver driver = new ChromeDriver();
        // get(url)打开一个网站
        driver.get("https://www.baidu.com");
        //getTitle()获取当前页面标题
        System.out.println("当前打开页面的标题是： "+ driver.getTitle());
        /**
         *  定位元素的九种方法
         *  By.id
         *  By.name
         *  By.tagName
         *  By.className
         *  By.xpath  //常用
         *  By.css("#kw")
         *  By.partialLinkText //模糊匹配
         *  By.linkText（"糯米"） eg:<a>糯米<a/>
         *  层级定位
         */
        driver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys("selenium");
        driver.get("file:///Users/anjie/dev/Intellij%20Idea/Auto-Selenium/examples/table.html");
        WebElement table = driver.findElement(By.tagName("table"));
        List<WebElement> trs = table.findElements(By.tagName("tr"));
        for (WebElement tr:trs
             ) {
            List<WebElement> tds = tr.findElements(By.tagName("td"));
            for (WebElement td:tds
                 ) {
                System.out.print(td.getText()+" ");
            }
            System.out.println();
        }
        //关闭并退出浏览器
        driver.quit();
    }
}
