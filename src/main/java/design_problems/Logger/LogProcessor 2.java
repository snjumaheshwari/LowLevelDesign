package design_problems.Logger;

public abstract class LogProcessor {
    LogProcessor nextLogProcessor;
    LogProcessor(LogProcessor nextLogProcessor){
        this.nextLogProcessor = nextLogProcessor;
    }
    void process(LogLevel level, String message) throws Exception {
        if(nextLogProcessor!=null){
            nextLogProcessor.process(level, message);
        }
        else{
            throw new Exception("Can not process log");
        }
    }
}
