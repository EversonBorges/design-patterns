package comportamentais.State.states;

import comportamentais.State.Pedido;
import comportamentais.State.interfaces.State;

public class PagoState extends State {

    private final Pedido pedido;

    public PagoState(Pedido pedido){
        this.pedido = pedido;
    }

    public void despacharPedido(String state) {
        pedido.setEstadoAtual(new DespachadoState(pedido));
    }

    public void cancelarPedido(String state) {
        pedido.setEstadoAtual(new CanceladoState(pedido));
    }

    @Override
    public String getEstado() {
        return "Pago";
    }
}
