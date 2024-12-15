package estruturais.Adapter;

public interface Gateway {

    void setValor(double valor);
    void setParcelas(int parcelas);
    void setNumeroCartao(String numeroCartao);
    void setCVV(String cvv);
    boolean validarCartao();
    boolean realizarPagamento();
}
