public class Assinatura {

    private final ComprovanteFiscal comprovanteFiscal;
    private final Pagamento pagamento;
    private final TermoPrivacidade termoPrivacidade;

    public Assinatura(FabricaArtefatos fabrica) {
        this.comprovanteFiscal = fabrica.criarComprovanteFiscal();
        this.pagamento = fabrica.criarPagamento();
        this.termoPrivacidade = fabrica.criarTermoPrivacidade();
    }

    public void relatorio() {
        System.out.println("Comprovante fiscal: "
                + comprovanteFiscal.descricao());

        System.out.println("Pagamento: "
                + pagamento.descricao());

        System.out.println("Termo de privacidade: "
                + termoPrivacidade.descricao());
    }
}