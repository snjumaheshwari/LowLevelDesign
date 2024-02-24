package design_problems.Logger;

public class ErrorLogProcessor extends LogProcessor {
    ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    void process(LogLevel level, String message) throws Exception {
        if(level == LogLevel.ERROR){
            System.out.println("** Error ** :  " + message);
        }
        else{
            super.process(level, message);
        }
    }
}
