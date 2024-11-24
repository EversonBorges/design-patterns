package Observer.observers;

import Observer.enumerator.Status;
import Observer.interfaces.Observers;
import Observer.interfaces.Subject;

import java.util.Arrays;
import java.util.List;

public class UsuarioMessage extends Observers {
    private final List<Status> statusList = Arrays.asList(Status.APROVADO, Status.CONCLUIDO);

    public UsuarioMessage(Subject subject){
        subject.registerObserver(this);
    }

    @Override
    public void update(String newStatus) {
        Status status  = getStatus(newStatus);
        if (statusList.contains(status)){
            System.out.println("Notificar Usuário Status -> " + status);
        }
    }
}
