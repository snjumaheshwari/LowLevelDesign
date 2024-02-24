package design_patterns.behavioral_pattern.observer_pattern.stock_example.observable;

import design_patterns.behavioral_pattern.observer_pattern.stock_example.observer.NotificationAlertObserver;

import java.util.List;

public class iPhoneObservableImpl implements StockObservable{

    List<NotificationAlertObserver> observers;
    int stockCount;

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        observers.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        observers.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscriber() {
        for (NotificationAlertObserver observer: observers) {
            observer.update();
        }
    }

    @Override
    public void addStocks(int newStockAdded) {
        if(stockCount == 0) {
            notifySubscriber();
        }
        stockCount += newStockAdded;
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }
}
