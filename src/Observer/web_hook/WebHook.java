package Observer.web_hook;

import Observer.interfaces.Observers;
import Observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.Collection;

public class WebHook implements Subject {

    private String status;
    private final Collection<Observers> observers = new ArrayList<>();


    @Override
    public void registerObserver(Observers o) {
        observers.add(o);
    }

    @Override
    public void removeRegister(Observers o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observers o : observers){
            o.update(status);
        }
    }

    public void  setStatus(String newStatus){
        this.status = newStatus;
        this.notifyObservers();
    }
}
