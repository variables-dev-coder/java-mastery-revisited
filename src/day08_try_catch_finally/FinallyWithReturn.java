package day08_try_catch_finally;

public class FinallyWithReturn {
    public static void main(String[] args) {
        System.out.println(test());
    }

    static int test() {
        try {
            return 10;
        } finally {
            System.out.println("Finally executed");
        }
    }
}

//Finally executed
//10

/*
static int test() {
    try {
        return 10;
    } finally {
        return 20;
    }
}

o/p 20
 */