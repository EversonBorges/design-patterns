package Observer.observers;

import Observer.enumerator.Status;
import Observer.interfaces.Observers;
import Observer.interfaces.Subject;

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
