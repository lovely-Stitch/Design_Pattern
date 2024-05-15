package com.principles.DIP.before;

//创建希捷硬盘类
public class XiJieHardDisk {

    //存储数据的方法
    public void save(String data){
        System.out.println("使用希捷硬盘存储数据" + data);
    }
    //读取数据的方法
    public String get(){
        System.out.println("使用希捷硬盘读取数据");
        return "数据(xijie)";
    }
}
