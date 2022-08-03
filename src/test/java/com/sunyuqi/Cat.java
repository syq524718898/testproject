package com.sunyuqi;

public class Cat extends Animal {

    public Object a=new Object();

    public void eat(){
        System.out.println(a);
        super.eat();
    }
}
