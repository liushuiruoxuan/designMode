package com.xt.pattern.factory.config_factory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class CoffeeFactory {

    private static HashMap<String, Coffee> map = new HashMap<>();

    static {
        Properties p = new Properties();
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("config/bean.properties");
        try {
            p.load(is);
            Set<Object> keys = p.keySet();
            for (Object key : keys) {
                String className = p.getProperty((String) key);
                Class clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.newInstance();
                map.put(key.toString(), coffee);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //根据名称获取对象
    public static Coffee createCoffee(String name) {
        return map.get(name);
    }
}

