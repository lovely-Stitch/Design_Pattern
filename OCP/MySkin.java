package com.principles.OCP;

//对子类的display方法进行重写
public class MySkin extends AbstractSkin{
    @Override
    public void display() {
        System.out.println("我的皮肤");
    }
}
