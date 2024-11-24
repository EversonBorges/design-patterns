package Strategy;

import Strategy.Frete.Frete;
import Strategy.Frete.FreteComum;
import Strategy.Frete.FreteEspecial;
import Strategy.Frete.FreteExpresso;
import Strategy.Pedido.PedidoEletronicos;
import Strategy.Pedido.PedidoMoveis;

public class Main {
    public static void main(String[] args) {

        Frete comum = new FreteComum();
        Frete expresso = new FreteExpresso();
        Frete especial = new FreteEspecial();

        PedidoEletronicos eletronicos = new PedidoEletronicos();
        eletronicos.setValor(229.10);
        System.out.println(eletronicos.getNomeSetor());

        eletronicos.setFrete(comum);
        System.out.println("Frete comum -> " + eletronicos.calculaFrete());

        eletronicos.setFrete(expresso);
        System.out.println("Frete expresso -> " + eletronicos.calculaFrete());

        eletronicos.setFrete(especial);
        System.out.println("Frete Especial -> " + eletronicos.calculaFrete());

        PedidoMoveis moveis = new PedidoMoveis();
        moveis.setValor(438.90);
        System.out.println(moveis.getNomeSetor());

        moveis.setFrete(comum);
        System.out.println("Frete comum -> " + moveis.calculaFrete());

        moveis.setFrete(expresso);
        System.out.println("Frete expresso -> " + moveis.calculaFrete());

        moveis.setFrete(especial);
        System.out.println("Frete Especial -> " + moveis.calculaFrete());


    }
}
