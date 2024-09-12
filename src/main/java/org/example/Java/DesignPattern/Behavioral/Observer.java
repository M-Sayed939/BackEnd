package org.example.Java.DesignPattern.Behavioral;
/*
Purpose: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
Use Cases: Commonly used in event handling systems like GUI frameworks.
 */
import java.util.ArrayList;
import java.util.List;

public class Observer {
    interface ObserverPattern {
        void update();
    }
    class Subject {
        private List<ObserverPattern> observers = new ArrayList<>();
        public void attach(ObserverPattern observer) {
            observers.add(observer);
        }
        public void notifyAllObservers() {
            for (ObserverPattern observer : observers) {
                observer.update();
            }
        }

    }
}
