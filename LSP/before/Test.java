package com.principles.LSP.before;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        resize(rectangle);
        print(rectangle);
        System.out.println("-----------------------");
        Square square = new Square();
        square.setLength(10);
        resize(square);
        print(square);
        //父类可以用resize方法而继承了父类的Square不能够用resize方法违背类里氏代换原则
    }

    //扩宽
    public static void resize(Rectangle rectangle){
        //判断宽如果比长小,进行扩宽
        while(rectangle.getWidth()<= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
        }
    }

    public static void print(Rectangle rectangle){
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getLength());
    }
}
