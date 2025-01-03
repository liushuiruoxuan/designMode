package com.xt.principles.demo3.before;

import com.xt.principles.demo3.after.Computer;
import com.xt.principles.demo3.after.Cpu;
import com.xt.principles.demo3.after.HardDisk;
import com.xt.principles.demo3.after.IntelCpu;
import com.xt.principles.demo3.after.KingstonMemory;
import com.xt.principles.demo3.after.Memory;
import com.xt.principles.demo3.after.XiJieHardDisk;

/**
 * 测试类
 */
public class ComputerDemo {
    public static void main(String[] args) {
        Cpu cpu = new IntelCpu();
        HardDisk hardDisk = new XiJieHardDisk();
        Memory memory = new KingstonMemory();
        Computer computer = new Computer();
        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setMemory(memory);
        computer.run();
    }
}
