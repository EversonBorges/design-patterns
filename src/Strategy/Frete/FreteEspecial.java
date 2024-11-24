package Strategy.Frete;

public class FreteEspecial implements Frete{
    @Override
    public double calcula(double valorPedido) {
        return valorPedido * 0.15;
    }
}
