public class Main {

    public static void main(String[] args) {

        ContratacaoFrete rodoviario = new ContratacaoFreteRodoviario();
        rodoviario.contratar("Empresa", 10000.00);

        ContratacaoFrete aereo = new ContratacaoFreteAereo();
        aereo.contratar("Outra Empresa", 10000.00);

        ContratacaoFrete maritimo = new ContratacaoFreteMaritimo();
        maritimo.contratar("Mais uma empresa", 10000.00);

        
    }
}
