package estruturais.Adapter.externos;

import java.util.Objects;

public class TopPagamentos {

    private String numeroCartao;
    private String CVV;

    public void setValorTotal(double valor) {
        System.out.println("TopPagamentos valor-> " + valor);
    }

    public void setQuantidadesParcelas(int parcelas) {
        System.out.println("TopPagamentos parcelas-> " + parcelas);
    }

    public void setCartao(String numeroCartao, String CVV) {
        this.numeroCartao = numeroCartao;
        this.CVV= CVV;
        System.out.println("TopPagamentos cartão-> " + numeroCartao + "--" + CVV);
    }

    public boolean realizarPagamento(){
        System.out.println("Pagamento realizado via TopPagamentos");
        return Objects.nonNull(numeroCartao) && (Objects.nonNull(CVV) && CVV.length() == 3);
    }
}
