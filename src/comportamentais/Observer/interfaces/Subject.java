package comportamentais.Observer.interfaces;

public interface Subject {
    void registerObserver(Observers o);
    void removeRegister(Observers o);
    void notifyObservers();
}
