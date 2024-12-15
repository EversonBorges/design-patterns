package estruturais.Adapter.Adapters;

import estruturais.Adapter.Gateway;
import estruturais.Adapter.externos.TopPagamentos;

import java.util.Objects;

public class TopPagamentosAdapter implements Gateway {

   private final TopPagamentos topPagamentos;
   private String CVV;
   private String numeroCartao;

   public TopPagamentosAdapter(TopPagamentos topPagamentos){
       this.topPagamentos = topPagamentos;
   }

    @Override
    public void setValor(double valor) {
       topPagamentos.setValorTotal(valor);
    }

    @Override
    public void setParcelas(int parcelas) {
        topPagamentos.setQuantidadesParcelas(parcelas);
    }

    @Override
    public void setNumeroCartao(String nroCartao) {
        this.numeroCartao = nroCartao;

        if(Objects.nonNull(this.CVV)){
            topPagamentos.setCartao(numeroCartao,CVV);
        }
    }

    @Override
    public void setCVV(String cvv) {
        this.CVV = cvv;

        if(Objects.nonNull(this.numeroCartao)){
            topPagamentos.setCartao(numeroCartao,CVV);
        }
    }

    @Override
    public boolean validarCartao() {
        return true;
    }

    @Override
    public boolean realizarPagamento() {
        return topPagamentos.realizarPagamento();
    }
}
