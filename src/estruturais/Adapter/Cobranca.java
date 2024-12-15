package estruturais.Adapter;

public class Cobranca {

    private Gateway gateway;

    public Cobranca(Gateway gateway){
        this.gateway= gateway;
    }

    public void setGateway(Gateway gateway) {
        this.gateway = gateway;
    }

    public void setValor(double valor){
        gateway.setValor(valor);
    }

    public void setParcelas(int parcelas){
        gateway.setParcelas(parcelas);
    }

    public void setNumeroCartao(String numeroCartao){
        gateway.setNumeroCartao(numeroCartao);
    }

    public void setCVV(String cvv){
        gateway.setCVV(cvv);
    }

    public boolean validarCartao(){
       return gateway.validarCartao();
    }

    public boolean realizarPagamento(){
        return gateway.realizarPagamento();
    }
}
