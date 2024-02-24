package design_problems.Logger;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Logger");

        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor( new ErrorLogProcessor(null)));

        logProcessor.process(LogLevel.INFO, "Info message");
        logProcessor.process(LogLevel.ERROR, "Error message");
        logProcessor.process(LogLevel.DEBUG, "Debug message ");

    }
}
