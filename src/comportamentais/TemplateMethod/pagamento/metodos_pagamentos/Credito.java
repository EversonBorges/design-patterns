package comportamentais.TemplateMethod.pagamento.metodos_pagamentos;

import comportamentais.TemplateMethod.gateway.Gateway;
import comportamentais.TemplateMethod.pagamento.Pagamento;

public class Credito extends Pagamento {

    public Credito(Double valor, Gateway gateway) {
        super(valor, gateway);
    }

    @Override
    public double calcularDesconto() {
        if(valor > 300)
            return valor * 0.02;
        return 0;
    }

    @Override
    public double calcularTaxa() {
        return valor * 0.05;
    }
}
