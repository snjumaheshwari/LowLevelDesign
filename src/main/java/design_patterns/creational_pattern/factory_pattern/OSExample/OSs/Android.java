package design_patterns.creational_pattern.factory_pattern.OSExample.OSs;

import design_patterns.creational_pattern.factory_pattern.OSExample.OS;

public class Android implements OS {
    @Override
    public void spec() {
        System.out.println("Android OS");
    }
}
