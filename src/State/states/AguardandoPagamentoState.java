package State.states;

import State.interfaces.State;
import State.Pedido;

public class AguardandoPagamentoState extends State {

    private final Pedido pedido;

    public AguardandoPagamentoState(Pedido pedido, String nomeState){
        this.pedido = pedido;
    }

    public void sucessoAoPagar(String state) throws Exception {
        pedido.setEstadoAtual(new PagoState(pedido));
    }

    public void cancelarPedido(String state){
        pedido.setEstadoAtual(new CanceladoState(pedido));
    }

    @Override
    public String getEstado() {
        return "Aguardando Pagamento";
    }
}
