package Strategy.Frete;

public class FreteExpresso implements Frete{
    @Override
    public double calcula(double valorPedido) {
        return valorPedido * 0.1;
    }
}
