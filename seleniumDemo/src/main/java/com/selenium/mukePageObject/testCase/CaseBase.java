package com.selenium.mukePageObject.testCase;

import com.selenium.mukePageObject.base.DriverBase;
import org.testng.annotations.AfterClass;

/**
 * @创建人 anjie
 * @创建时间 2019/2/20
 * @描述
 */
public class CaseBase {
    public DriverBase initDriver(String brower){
        return new DriverBase(brower);
    }
}
