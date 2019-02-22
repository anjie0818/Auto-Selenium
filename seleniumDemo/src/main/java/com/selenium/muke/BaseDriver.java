package com.selenium.muke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * @创建人 anjie
 * @创建时间 2019/2/20
 * @描述
 */
public class BaseDriver {
    private WebDriver driver;
    MukeLoginScript mukeLoginScript;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void setup()
    {
        System.out.println("begin test");
        System.setProperty("webdriver.chrome.driver", "F:\\IdeaProjects\\Auto-Selenium\\image\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        mukeLoginScript=new MukeLoginScript(getDriver());
    }
    @AfterClass
    public void teardown() throws InterruptedException {
        System.out.println("end test");
        Thread.sleep(2000);
        driver.close();
    }
}
