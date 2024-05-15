package com.principles.OCP;

//聚合类
public class ShuRuFa {

    private AbstractSkin abstractSkin;

    public void setAbstractSkin(AbstractSkin abstractSkin) {
        this.abstractSkin = abstractSkin;
    }

    public void display(){
        abstractSkin.display();
    }
}
