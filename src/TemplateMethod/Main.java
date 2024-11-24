package TemplateMethod;

import TemplateMethod.gateway.Gateway;
import TemplateMethod.pagamento.metodos_pagamentos.Credito;
import TemplateMethod.pagamento.metodos_pagamentos.Debito;
import TemplateMethod.pagamento.metodos_pagamentos.Dinheiro;

public class Main {
    public static void main(String[] args) {
        double valor = 1000;
        var gateway = new Gateway();

        System.out.println("Crédito");
        var credito = new Credito(valor,gateway);
        var resultCredito = credito.realizarCobranca();
        System.out.println("Result -> " + resultCredito);

        System.out.println("Débito");
        var debito = new Debito(valor, gateway);
        var resultDebito = debito.realizarCobranca();
        System.out.println("Result -> " + resultDebito);

        System.out.println("Dinheiro");
        var dinheiro = new Dinheiro(valor, gateway);
        var resultDinheiro = dinheiro.realizarCobranca();
        System.out.println("Result -> " + resultDinheiro);
    }
}
