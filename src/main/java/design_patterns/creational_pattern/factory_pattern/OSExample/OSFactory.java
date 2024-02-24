package design_patterns.creational_pattern.factory_pattern.OSExample;

import design_patterns.creational_pattern.factory_pattern.OSExample.OSs.Android;
import design_patterns.creational_pattern.factory_pattern.OSExample.OSs.IOS;
import design_patterns.creational_pattern.factory_pattern.OSExample.OSs.Windows;

public class OSFactory {

    public OS getInstance(String str){
        if(str.equals("open")){
            return new Android();
        }
        else if(str.equals("close")){
            return new IOS();
        }
        else{
            return new Windows();
        }
    }
}
