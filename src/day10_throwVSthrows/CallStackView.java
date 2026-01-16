package day10_throwVSthrows;

public class CallStackView {

    static void a() {
        b();
    }

    static void b() {
        c();
    }

    static void c() {
        throw new RuntimeException("Boom");
    }

    public static void main(String[] args) {
        a();
    }
}

//Read stack trace bottom → top
//Match methods with flow
