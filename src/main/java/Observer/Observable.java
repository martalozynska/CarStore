package Observer;
import java.util.ArrayList;

public class Observable {
    ArrayList<Observer> observers;

    public Observable(ArrayList<Observer> observers) {
        this.observers = observers;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Observer observer) {
        for (Observer observer1 : observers) {
            observer1.update();
        }
    }
}
