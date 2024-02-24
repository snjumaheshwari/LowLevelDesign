package design_patterns.behavioral_pattern.observer_pattern.stock_example.observer;

public class MessageAlertObserver implements NotificationAlertObserver {
    String num;

    // if req. we can keep object of observable here as well.

    public MessageAlertObserver(String num){
        this.num = num;
    }

    @Override
    public void update() {
        sendMessage("Stock is available");
    }
    public void sendMessage(String msg){
        System.out.println(msg);
    }
}
