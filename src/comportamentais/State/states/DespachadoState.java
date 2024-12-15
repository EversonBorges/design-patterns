package comportamentais.State.states;

import comportamentais.State.Pedido;
import comportamentais.State.interfaces.State;

public class DespachadoState extends State {

    private final Pedido pedido;
    public DespachadoState(Pedido pedido){
        this.pedido = pedido;
    }

    @Override
    public String getEstado() {
        return "Despachado";
    }

}
