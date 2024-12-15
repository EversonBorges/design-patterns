package comportamentais.Strategy.Pedido;

public class PedidoMoveis extends Pedido{
    private String nomeSetor;

    public PedidoMoveis() {
        this.nomeSetor = "Pedidos Moveis";
    }

    public String getNomeSetor() {
        return nomeSetor;
    }

    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }
}
