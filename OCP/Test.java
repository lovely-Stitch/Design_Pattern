package com.principles.OCP;

public class Test {
    public static void main(String[] args) {
        //1.创建输入法对象
        ShuRuFa input = new ShuRuFa();
        //2.创建皮肤对象
        DefaultSkin skin = new DefaultSkin();
        //3.给抽象皮肤类赋值
        input.setAbstractSkin(skin);
        //4.调用输入法方法
        skin.display();
    }
}
