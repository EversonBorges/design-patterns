package Strategy.Pedido;

import Strategy.Frete.Frete;

public abstract class Pedido {
    private double valor;
    private Frete frete;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }

    public double calculaFrete(){
        return this.frete.calcula(this.valor);
    }
}
