package comportamentais.State;

import comportamentais.State.interfaces.State;
import comportamentais.State.states.AguardandoPagamentoState;

public class Pedido {

    public State estadoAtual;

    public Pedido(){
        estadoAtual = new AguardandoPagamentoState(this, "Aguardando Pagamento");
    }

    public void realizarPagamento() throws Exception {
            estadoAtual.sucessoAoPagar(estadoAtual.getEstado());
    }

    public void cancelarPedido() throws Exception {
            estadoAtual.cancelarPedido(estadoAtual.getEstado());

    }

    public void despacharPedido() throws Exception {
            estadoAtual.despacharPedido(estadoAtual.getEstado());

    }

    public void setEstadoAtual(State state){
        this.estadoAtual = state;
    }
}
