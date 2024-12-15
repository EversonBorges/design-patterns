package estruturais.Adapter;

import estruturais.Adapter.Adapters.PagFacilAdapter;
import estruturais.Adapter.Adapters.TopPagamentosAdapter;
import estruturais.Adapter.externos.TopPagamentos;

public class Main {
    public static void main(String[] args) {

        var pagFacilAdapter = new PagFacilAdapter();
        var topPagamentoAdapter = new TopPagamentosAdapter(new TopPagamentos());

        System.out.println("Cobrança utilizando PagFacil como Gateway");
        var cobranca = new Cobranca(pagFacilAdapter);
        cobranca.setCVV("123");
        cobranca.setParcelas(3);
        cobranca.setNumeroCartao("1234890976542434");
        cobranca.setValor(200);

        if (cobranca.validarCartao()) {
            System.out.println("Valido");
           var result = cobranca.realizarPagamento();
           if(result){
               System.out.println("Pago");
           }else {
               System.out.println("Não pago");
           }
        } else {
            System.out.println("invalido");
        }

        System.out.println("Cobrança utilizando TopPagamentos como Gateway");

        cobranca.setGateway(topPagamentoAdapter);
        cobranca.setCVV("789");
        cobranca.setParcelas(5);
        cobranca.setNumeroCartao("1234890976542434");
        cobranca.setValor(500);

        var result = cobranca.realizarPagamento();
        if(result){
            System.out.println("Pago");
        }else {
            System.out.println("Não pago");
        }
    }
}
