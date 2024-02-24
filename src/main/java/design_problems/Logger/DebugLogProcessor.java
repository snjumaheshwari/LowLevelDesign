package design_problems.Logger;

public class DebugLogProcessor extends LogProcessor{

    DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    void process(LogLevel level, String message) throws Exception{
        if(level == LogLevel.DEBUG){
            System.out.println("[Debug] : " + message);
        }
        else{
            super.process(level, message);
        }
    }
}
