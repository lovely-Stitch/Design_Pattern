package com.principles.LSP.after;

public class Test {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setWidth(10);
        r.setLength(20);
        resize(r);
        print(r);
        //此处resize参数无法再传square
    }

    public static void resize(Rectangle rectangle){
        while(rectangle.getWidth()<= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
        }
    }

    public static void print(Quadrilateral quadrilateral){
        System.out.println(quadrilateral.getLength());
        System.out.println(quadrilateral.getWidth());
    }
}
