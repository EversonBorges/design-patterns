package comportamentais.Observer.enumerator;

public enum Status {
    INICIADO("Iniciado"), //Notifica supervisor
    ANALISADO("Analisado"),//Notifica Gerente
    APROVADO("Aprovado"),//Notifica Presidente e usuario
    REPROVADO("Reprovado"),//Notifica Presidente
    CONCLUIDO("Concluído");//Notifica todos

    private final String nome;

    // Construtor do enum que recebe o nome do status
    Status(String nome) {
        this.nome = nome;
    }

    // Método para retornar o nome do status
    public String getNome() {
        return nome;
    }

    // Método estático que recebe uma string e retorna o enum correspondente
    public static Status fromString(String status) {
        for (Status s : Status.values()) {
            if (s.getNome().equalsIgnoreCase(status)) {
                return s;
            }
        }
        throw new IllegalArgumentException("Status não encontrado: " + status);
    }
}
