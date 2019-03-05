package com.selenium.ahic;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.selenium.ahic.TestngListenerScreen;

/**
 * @创建人 anjie
 * @创建时间 2019/2/20
 * @描述
 */
@Listeners({TestngListenerScreen.class})
public class AHBaseDriver  {
    static WebDriver driver;

    @BeforeClass
    public void setup() throws InterruptedException {
        System.out.println("begin test");
        driver=AhicTest.init();
        String url1="10.199.3.4:7002";
        String url2="10.0.0.172";
        String url3="10.0.0.173";
        String url4="www.ahic.com.cn";
        AhicTest.login("http://"+url4+"/web/ahic/web/user/ahlogin.jsp","0200003905","0000");
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
    @AfterClass
    public void teardown() throws InterruptedException {
        System.out.println("end test");
        Thread.sleep(2000);
//        AhicTest.driver.close();
    }
}
