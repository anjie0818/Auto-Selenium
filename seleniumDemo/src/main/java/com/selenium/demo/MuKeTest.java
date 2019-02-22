package com.selenium.demo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class MuKeTest {
    static WebDriver  driver;
    public static void init(){
        System.setProperty("webdriver.chrome.driver", "F:\\IdeaProjects\\Auto-Selenium\\image\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    public static void main(String[] args) throws Exception {
            init();
            //初始化一个chrome浏览器实例driver
            driver.navigate().to("https://www.imooc.com/");
            Thread.sleep(1000);
            driver.manage().window().maximize();
            driver.findElement(By.linkText("登录")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"signup-form\"]/div[1]/input")).sendKeys("15652761388");
            driver.findElement(By.name("password")).sendKeys("anjie123B");
            //单选按钮
            WebElement check = driver.findElement(By.xpath("//*[@id=\"auto-signin\"]"));
            check.click();
            System.out.println("isEnabled"+check.isEnabled());
            System.out.println("isDisplayed"+check.isDisplayed());
            System.out.println("isSelected"+check.isSelected());
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"signup-form\"]/div[5]/input")).click();
            Thread.sleep(1000);

            //鼠标操作
//            mouseAction();
            iframe();
        Thread.sleep(2000);
        /**
         * 关闭所有页面quit
         * 关闭单个页面close
         */
        driver.quit();

    }
    /**
     * iframe操作
     */
    public static void iframe() throws InterruptedException {
        driver.get("https://www.imooc.com/wiki/create");
        //找到ifrmae
        WebElement iframe = driver.findElement(By.id("ueditor_0"));
        driver.switchTo().frame(iframe);
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body")).sendKeys("anjie");
        driver.switchTo().defaultContent();
    }
    /**
     * 窗口操作
     */
    public static void windowsHandle(String s){
        System.out.println(s);
        Set<String> handlers = driver.getWindowHandles();
        for (String handler:handlers
             ) {
            if (s.equals(handler)){
                continue;
            }
            driver.switchTo().window(handler);
            System.out.println(handler);
        }
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div[2]/div/div[3]/div/ul/li[3]/a")).click();

    }
    /**
     * 鼠标操作
     */
    public static void mouseAction() throws InterruptedException {
        Actions action=new Actions(driver);
        //找点击菜单栏
        WebElement menu = driver.findElement(By.className("menuContent"));
        List<WebElement> items = menu.findElements(By.className("item"));
        action.moveToElement(items.get(3)).perform();
        Thread.sleep(3000);
        driver.findElement(By.linkText("WEEX")).click();
        windowsHandle(driver.getWindowHandle());

    }

        /**
         * 跳转个人信息
         */
    public static void toUserInfo() throws InterruptedException {
        //跳转到个人信息页面
        driver.navigate().to("https://www.imooc.com/user/setprofile");
        /**
         * 编辑个人信息
         */
        driver.findElement(By.xpath("//*[@id=\"setting-profile\"]/div[2]/a")).click();
        Thread.sleep(3000);
        WebElement radios = driver.findElement(By.xpath("//*[@id=\"profile\"]/div[4]/div"));
        //单选框处理
        List<WebElement> inputs = radios.findElements(By.tagName("input"));
        for (WebElement webE:inputs
                ) {
            String sex = webE.getAttribute("value");
            if (sex.equals("0")){
                webE.click();
            }
        }
        Thread.sleep(3000);
        //下拉框操作
        downSelectBox();
    }
    /**
     * 下拉框方法
     */
    public static void downSelectBox() throws InterruptedException {
        WebElement profile = driver.findElement(By.id("profile"));
        WebElement job = profile.findElement(By.id("job"));
        job.click();
        Thread.sleep(1000L);
        Select select=new Select(job);
        select.selectByIndex(2);
        Thread.sleep(1000L);
        select.selectByValue("11");
        Thread.sleep(1000L);
        select.selectByVisibleText("算法工程师");
        Thread.sleep(1000L);


    }
    public static void updatePicture() throws InterruptedException {
        /**
         * 修改个人头像
         */
        String clickImage="document.getElementsByClassName('update-avator')[0].style.cssText = \"bottom: 0px;\";";
        JavascriptExecutor jsdriver = (JavascriptExecutor) driver;
        jsdriver.executeScript(clickImage);
        Thread.sleep(3000);
        driver.findElement(By.className("update-avator")).click();
        Thread.sleep(3000);
        //上传图片
        driver.findElement(By.id("upload")).sendKeys("/Users/anjie/dev/Intellij Idea/Auto-Selenium/image/selenium2.png");
        driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div/div/div[2]/div/a[1]")).click();
        //关闭弹出窗口
        driver.findElement(By.className("moco-icon-close")).click();
        Thread.sleep(3000);
    }
}
