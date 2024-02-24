package design_patterns.creational_pattern.factory_pattern.OSExample;

public class Main {
    public static void main(String[] args){
        OSFactory osf = new OSFactory();
        osf.getInstance("old");
    }
}
