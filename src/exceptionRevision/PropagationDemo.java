package exceptionRevision;

public class PropagationDemo {
    static void a() { b(); }
    static void b() { c(); }
    static void c() { int x = 10 / 0; }

    public static void main(String[] args) {
        a();
    }
}

