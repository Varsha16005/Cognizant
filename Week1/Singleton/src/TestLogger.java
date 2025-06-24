public class TestLogger {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Starting application...");

        Logger logger2 = Logger.getInstance();
        logger2.log("Processing data...");

        if (logger1 == logger2) {
            System.out.println("Both loggers are the same instance.");
        } else {
            System.out.println("Different instances found! Singleton failed.");
        }
    }
}
