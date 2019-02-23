package com.selenium.ahic;

import com.selenium.muke.MukeLoginScript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @创建人 anjie
 * @创建时间 2019/2/20
 * @描述
 */
public class AHBaseDriver {

    @BeforeClass
    public void setup() throws InterruptedException {
        System.out.println("begin test");
        AhicTest.init();
    }
    @Test
    public void startDo() throws InterruptedException {
        AhicTest.startDo();
    }
    @Test
    public void SelectPolicyno(){
        AhicTest.SelectPolicyno();
    }
    @Test
    public void SelectFaPiao(){
        AhicTest.SelectFaPiao();
    }
    @Test
    public void SelectPrint(){
        AhicTest.SelectPrint();
    }
    @Test
    public void SelectDangZheng(){
        AhicTest.SelectDangZheng();
    }
    @Test
    public void SelectPiGai(){
        AhicTest.SelectPiGai();

    }
    @Test
    public void SelectVIN(){
        AhicTest.SelectVIN();

    }
    @Test
    public void SelectTeShuYeWu(){
        AhicTest.SelectTeShuYeWu();

    }
    @Test
    public void SelectUpload(){
        AhicTest.SelectUpload();

    }

//    @AfterClass
    public void teardown() throws InterruptedException {
        System.out.println("end test");
        Thread.sleep(2000);
        AhicTest.driver.close();
    }
}
