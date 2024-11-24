package Observer.interfaces;

import Observer.enumerator.Status;

public abstract class Observers {
    public abstract  void update(String status);

    protected Status getStatus(String status){
        return Status.fromString(status);
    };
}
