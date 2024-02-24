package design_patterns.behavioral_pattern.observer_pattern.stock_example.observer;

public class EmailAlertObserver implements NotificationAlertObserver{
    String emailId;

    public EmailAlertObserver(String emailId){
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendEmail("Stock is available");
    }
    public void sendEmail(String msg){
        System.out.println(msg);
    }
}
