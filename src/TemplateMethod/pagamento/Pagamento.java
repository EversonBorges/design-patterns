package TemplateMethod.pagamento;

import TemplateMethod.gateway.Gateway;

public abstract  class Pagamento {

    protected double valor;
    protected Gateway gateway;

    public Pagamento(Double valor, Gateway gateway){
        this.valor = valor;
        this.gateway = gateway;
    }

    //As subclasse que implementam o comportamento, realizando a invercao de dependencia
    public abstract double calcularDesconto();

    //Metodo HOOK pode ser sobre-escrito, caso não seja retorna o valor padrão.
    public double calcularTaxa(){
        return 0;
    }

    //Template Method, utiliza os retornos das abstrações para calculo, fazendo a injeçao de dependencia
    public boolean realizarCobranca(){
        double valorFinal = valor + calcularTaxa() - calcularDesconto();
        System.out.println("Impressão -> "
                + valor + "---"
                + calcularDesconto() + "---"
                + calcularTaxa() + "---"
                + valorFinal + "---" );
        return gateway.cobrar(valorFinal);
    }
}
