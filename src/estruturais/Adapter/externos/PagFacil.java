package estruturais.Adapter.externos;

import java.util.Objects;

public class PagFacil {

    private String numeroCartao;
    private String CVV;

    public void setValor(double valor) {
        System.out.println("PagFacil valor-> " + valor);
    }

    public void setParcelas(int parcelas) {
        System.out.println("PagFacil parcelas-> " + parcelas);
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
        System.out.println("PagFacil numero cartão-> " + numeroCartao);
    }

    public void setCVV(String CVV) {
        this.CVV= CVV;
        System.out.println("PagFacil CVV-> " + CVV);
    }

    public boolean validarCartao(){
        return Objects.nonNull(numeroCartao) && (Objects.nonNull(CVV) && CVV.length() == 3);
    }

    public boolean realizarPagamento(){
        System.out.println("Pagamento realizado via PagFacil");
        return true;
    }
}
