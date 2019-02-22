package com.selenium.demo;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Test {
    static WebDriver  driver;
    public static void main(String[] args)  {
        driver = new ChromeDriver();
        //给浏览器输入栏输入一个连接
        driver.get("http://huodong.12kaixue.net/s/0-v134.html");

        //获取页面按钮
        WebElement rush_btn = driver.findElement(By.id("rush_btn"));

        //点击按钮
        rush_btn.click();

        //浏览器最大化
        driver.manage().window().maximize();

        //找到页面浮动DIV
        driver.findElement(By.className("fl")).click();

        //找到页面浮动DIV，帐号输入框
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("x986");

        //找到页面浮动DIV，密码输入框
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("a123456");

        //找到页面浮动DIV，登录按钮，点击登录
        driver.findElement(By.className("submit-input")).click();

        //关闭事件
        driver.close();

    }
}
