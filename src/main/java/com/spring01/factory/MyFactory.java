package com.spring01.factory;

import java.io.IOException;
import java.util.Properties;

public class MyFactory {
    private Properties properties = new Properties();
    public MyFactory(){};
    public MyFactory(String config) throws IOException {
        //加载配置文件
        properties.load(MyFactory.class.getResourceAsStream(config));
    }
//获取对象
    public Object getBean(String beanName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //获取类路径
        String classPath = properties.getProperty(beanName);
        if(classPath != null){
            Class clazz = null;
            //反射：加载类路径
            clazz = Class.forName(classPath);
            return clazz.newInstance();
        }
        return null;
    }
}
