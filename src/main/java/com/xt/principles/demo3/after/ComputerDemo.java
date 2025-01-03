package com.xt.principles.demo3.after;


/**
 * 测试类
 */
public class ComputerDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setCpu(new IntelCpu());
        computer.setHardDisk(new XiJieHardDisk());
        computer.setMemory(new KingstonMemory());
        computer.run();
    }
}
