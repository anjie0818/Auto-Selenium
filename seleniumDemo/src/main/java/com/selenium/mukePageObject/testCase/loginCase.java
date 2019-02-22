package com.selenium.mukePageObject.testCase;

import com.selenium.muke.GetByLocator;
import com.selenium.mukePageObject.base.DriverBase;
import com.selenium.mukePageObject.business.LoginPro;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @创建人 anjie
 * @创建时间 2019/2/20
 * @描述
 */
public class loginCase extends CaseBase{
    private static Logger logger = Logger.getLogger(loginCase.class);

    public DriverBase driverBase;
    public LoginPro loginPro;
    /**
     * 构造函数初始化是在Testng加载的时候进行的
     */
    public loginCase(String s ){
        this.driverBase=initDriver("chrome");
        loginPro=new LoginPro(driverBase);
    }
    @Test
    public void getLoginHome() throws IOException {
        driverBase.open("http://www.imooc.com");
        driverBase.maximize();
        driverBase.element(GetByLocator.getLocator("toLoginButton")).click();
    }
    @Test(dependsOnMethods = "getLoginHome")
    public void testLogin() throws IOException, InterruptedException {
        Thread.sleep(2000);
        loginPro.login("15652761388","anjie123B");
    }
    @Test
    public void logTest(){
        // 记录debug级别的信息
        logger.debug("This is debug message.");
        // 记录info级别的信息
        logger.info("This is info message.");
        // 记录error级别的信息
        logger.error("This is error message.");
        Assert.assertEquals(1,3);
    }

}
