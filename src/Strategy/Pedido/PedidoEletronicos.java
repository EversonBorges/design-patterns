package Strategy.Pedido;

public class PedidoEletronicos extends Pedido{
    private String nomeSetor;

    public PedidoEletronicos() {
        this.nomeSetor = "Pedidos Eeletrônicos";
    }

    public String getNomeSetor() {
        return nomeSetor;
    }

    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }
}
