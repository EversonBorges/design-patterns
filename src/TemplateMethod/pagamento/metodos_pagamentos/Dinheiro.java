package TemplateMethod.pagamento.metodos_pagamentos;

import TemplateMethod.gateway.Gateway;
import TemplateMethod.pagamento.Pagamento;

public class Dinheiro extends Pagamento {

    public Dinheiro(Double valor, Gateway gateway) {
        super(valor, gateway);
    }

    @Override
    public double calcularDesconto() {
        return valor * 0.1;
    }
}
