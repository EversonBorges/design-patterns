package comportamentais.Observer.observers;

import comportamentais.Observer.enumerator.Status;
import comportamentais.Observer.interfaces.Observers;
import comportamentais.Observer.interfaces.Subject;

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
