package day02_Core_Java_Fundamentals.pack2;

import day02_Core_Java_Fundamentals.A;

public class B extends A {

    public static void main(String[] args) {

        A obj = new A();

        System.out.println(obj.pub);   // public

       // System.out.println(obj.def);   // default

       // System.out.println(obj.pri);    // private

        B b = new B();
        System.out.println(b.pro);     // protected via inheritance
    }
}
