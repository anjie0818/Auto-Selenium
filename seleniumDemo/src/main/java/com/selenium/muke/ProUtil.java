package com.selenium.muke;

import java.io.*;
import java.util.Properties;

/**
 * @创建人 anjie
 * @创建时间 2019/2/19
 * @描述
 */
public class ProUtil {
    private String url;

    public ProUtil(String url) {
        this.url = url;
    }
    public String  getPro(String key) throws IOException {
        Properties properties = new Properties();
        // 使用ClassLoader加载properties配置文件生成对应的输入流
        System.out.println();
        InputStream in = this.getClass().getClassLoader().getResourceAsStream(url);
        // 使用properties对象加载输入流
        properties.load(new InputStreamReader(in, "utf-8"));
        return properties.getProperty(key);
    }
}
