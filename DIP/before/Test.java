package com.principles.DIP.before;

public class Test {
    public static void main(String[] args) {
        //创建计算机及各种配件对象
        Computer c = new Computer();
        XiJieHardDisk hardDisk = new XiJieHardDisk();
        InterCpu cpu = new InterCpu();
        KingstonMemory memory = new KingstonMemory();
        //组装
        c.setHardDisk(hardDisk);
        c.setCpu(cpu);
        c.setMemory(memory);
        //运行
        c.run();
    }
}
