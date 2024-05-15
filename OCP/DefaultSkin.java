package com.principles.OCP;

//默认皮肤类,通过对父类进行继承并对子类的display方法进行重写,从而进行扩展
public class DefaultSkin extends AbstractSkin{
    @Override
    public void display() {
        System.out.println("默认皮肤");
    }
}
