package comportamentais.State.interfaces;

public abstract class State {

    public void sucessoAoPagar(String state) throws Exception {
        lancaException(state);
    }
    public void despacharPedido(String state) throws Exception {
        lancaException(state);
    }
    public void cancelarPedido(String state) throws Exception {
        lancaException(state);
    }
    void emitirNotaFiscal(String state) throws Exception {
        lancaException(state);
    }

    private void lancaException(String state) throws Exception {
        throw new Exception("Operação não permitida, estado atual :" + state);
    }

     public abstract String getEstado();
}
