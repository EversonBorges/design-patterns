package comportamentais.Strategy.Frete;

public class FreteComum implements Frete{
    @Override
    public double calcula(double valorPedido) {
        return valorPedido * 0.05;
    }
}
