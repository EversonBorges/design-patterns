package comportamentais.Observer.observers;

import comportamentais.Observer.enumerator.Status;
import comportamentais.Observer.interfaces.Observers;
import comportamentais.Observer.interfaces.Subject;

import java.util.Arrays;
import java.util.List;

public class SupervisorMessage extends Observers {

    private final List<Status> statusList = Arrays.asList(
            Status.INICIADO, Status.CONCLUIDO,Status.APROVADO,Status.REPROVADO);

    public SupervisorMessage(Subject subject){
        subject.registerObserver(this);
    }

    @Override
    public void update(String newStatus) {
        Status status  = getStatus(newStatus);
        if (statusList.contains(status)){
            System.out.println("Notificar Supervisor Status -> " + status);
        }
    }
}
