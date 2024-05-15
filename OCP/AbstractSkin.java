package com.principles.OCP;
//开闭原则:对扩展开放,对修改关闭.对程序进行扩展时不能修改原有代码,通过派生子类实现扩展

//创建抽象的皮肤类
public abstract class AbstractSkin {
    //抽象皮肤的显示方法
    public abstract void display();

}
