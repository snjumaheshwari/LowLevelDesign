package design_patterns.behavioral_pattern.observer_pattern.stock_example.observable;

import design_patterns.behavioral_pattern.observer_pattern.stock_example.observer.NotificationAlertObserver;

public interface StockObservable {

    void add(NotificationAlertObserver notificationAlertObserver);
    void remove(NotificationAlertObserver notificationAlertObserver);

    void notifySubscriber();

    void addStocks(int newStockAdded);

    int getStockCount();

}
