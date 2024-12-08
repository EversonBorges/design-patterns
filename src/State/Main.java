package State;

public class Main {
    public static void main(String[] args) throws Exception {

        Pedido pedido = new Pedido();
        pedido.realizarPagamento();
        pedido.despacharPedido();
        pedido.cancelarPedido();

        //Commitar
    }
}
