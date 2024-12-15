package comportamentais.Observer;

import comportamentais.Observer.observers.ManagerMessage;
import comportamentais.Observer.observers.PresidentMessage;
import comportamentais.Observer.observers.SupervisorMessage;
import comportamentais.Observer.observers.UsuarioMessage;
import comportamentais.Observer.web_hook.WebHook;

public class Main {
    public static void main(String[] args) {

        WebHook hook = new WebHook();
        new UsuarioMessage(hook);
        new SupervisorMessage(hook);
        new ManagerMessage(hook);
        new PresidentMessage(hook);
        System.out.println("Inicio processo 01");
        hook.setStatus("Iniciado");
        System.out.println("--------------------------");
        hook.setStatus("Analisado");
        System.out.println("--------------------------");
        hook.setStatus("Reprovado");
        System.out.println("--------------------------");
        hook.setStatus("Concluído");
        System.out.println("##############################");
        System.out.println("Inicio processo 02");
        hook.setStatus("Iniciado");
        System.out.println("--------------------------");
        hook.setStatus("Analisado");
        System.out.println("--------------------------");
        hook.setStatus("Aprovado");
        System.out.println("--------------------------");
        hook.setStatus("Concluído");



    }
}
