package com.selenium.ahic;
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
        String url1="10.199.3.4:7002";
        String url2="10.0.0.172";
        String url3="10.0.0.173";
        String url4="www.ahic.com.cn";

        AhicTest.login("http://"+url4+"/web/ahic/web/user/ahlogin.jsp","0200002272","aa00000");
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
