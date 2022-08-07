package subsistema2.cep;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super(); // não é obrigatório essa chamada explícita
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Santa Rosa de Viterbo";
    }

    public String recuperarEstado(String cep) {
        return "SP";
    }
}
