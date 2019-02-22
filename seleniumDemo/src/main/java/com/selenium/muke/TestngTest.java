package com.selenium.muke;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.io.IOException;

/**
 * @创建人 anjie
 * @创建时间 2019/2/19
 * @描述
 */
@Listeners({TestngListenerScreen.class})
public class TestngTest extends BaseDriver {

    @Test
    public void test1() throws IOException, InterruptedException {
        System.out.println("at test1");
        mukeLoginScript.goLogin("15652761388","anjie123B");
//        Assert.assertEquals(1,3);

    }
    @Test
    public void test2() throws IOException, InterruptedException {
        System.out.println("at test2");
        mukeLoginScript.goLogin("15652761388","an1jie123B");
    }
    @Test
    public void test3()
    {
        System.out.println("at test3");
    }


}
