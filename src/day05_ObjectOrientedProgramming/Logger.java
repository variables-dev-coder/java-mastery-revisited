package day05_ObjectOrientedProgramming;

interface Logger {

    default void logInfo() {
        System.out.println("Info log");
    }

    static void logError() {
        System.out.println("Error log");
    }
}

class AppLogger implements Logger {

    public static void main(String[] args) {
        AppLogger l = new AppLogger();
        l.logInfo();
        Logger.logError();
    }
}

//Info log
//Error log