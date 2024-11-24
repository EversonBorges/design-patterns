package TemplateMethod.pagamento.metodos_pagamentos;

import TemplateMethod.gateway.Gateway;
import TemplateMethod.pagamento.Pagamento;

public class Debito extends Pagamento {

    public Debito(Double valor, Gateway gateway) {
        super(valor, gateway);
    }

    @Override
    public double calcularDesconto() {
        return valor * 0.05;
    }

    @Override
    public double calcularTaxa() {
        return 4;
    }
}
