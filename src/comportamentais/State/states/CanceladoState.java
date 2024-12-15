package comportamentais.State.states;

import comportamentais.State.Pedido;
import comportamentais.State.interfaces.State;

public class CanceladoState extends State {

    private final Pedido pedido;

    public CanceladoState(Pedido pedido){
        this.pedido = pedido;
    }

    @Override
    public String getEstado() {
        return "Cancelado";
    }
}
