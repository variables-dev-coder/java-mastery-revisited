package day02_Core_Java_Fundamentals;

public class A {
    public int pub = 10;
    protected int pro = 20;
    int def = 30;
    private int pri = 40;

    public void show() {
        System.out.println(pub + " " + pro + " " + def + " " + pri);
    }
}
