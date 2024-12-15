package comportamentais.Observer.observers;

import comportamentais.Observer.enumerator.Status;
import comportamentais.Observer.interfaces.Observers;
import comportamentais.Observer.interfaces.Subject;

import java.util.Arrays;
import java.util.List;

public class PresidentMessage extends Observers {

    private final List<Status> statusList = Arrays.asList(Status.APROVADO,Status.REPROVADO,Status.CONCLUIDO);

    public PresidentMessage(Subject subject){
        subject.registerObserver(this);
    }

    @Override
    public void update(String newStatus) {
        Status status  = getStatus(newStatus);
        if (statusList.contains(status)){
            System.out.println("Notificar Presidente Status -> " + status);
        }
    }
}
