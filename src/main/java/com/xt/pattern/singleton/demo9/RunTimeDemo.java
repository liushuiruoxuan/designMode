package com.xt.pattern.singleton.demo9;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunTimeDemo {
    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("ipconfig");
        InputStream inputStream = process.getInputStream();
        byte[] arr = new byte[1024 * 1024 * 1000];
        int let = inputStream.read(arr);
        System.out.println(new String(arr, 0, let, "GBK"));

    }
}
