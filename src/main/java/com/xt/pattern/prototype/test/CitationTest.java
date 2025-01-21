package com.xt.pattern.prototype.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CitationTest {
    public static void main(String[] args) throws Exception {
        Citation citation1 = new Citation();
        Student stu = new Student();
        stu.setName("张三");
        citation1.setStu(stu);


        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\a_prototype.txt"));
        oos.writeObject(citation1);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\a_prototype.txt"));

        Citation citation2 = (Citation) ois.readObject();
        ois.close();
        citation2.getStu().setName("李四");
        citation1.show();
        citation2.show();
    }
}
