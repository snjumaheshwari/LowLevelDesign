package design_problems.Logger;

public class InfoLogProcessor extends LogProcessor {

    InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    void process(LogLevel level, String message) throws  Exception{
        if(level == LogLevel.INFO){
            System.out.println("Info : " + message);
        }
        else{
            super.process(level, message);
        }
    }
}
