package exceptionRevision;

class ServiceException extends Exception {
    public ServiceException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

class Test2 {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            throw new RuntimeException(
                    new ServiceException("Service failed", e)
            );
        }
    }
}

