public class FabricaBrasil implements FabricaArtefatos {

    @Override
    public ComprovanteFiscal criarComprovanteFiscal() {
        return new Nfse();
    }

    @Override
    public Pagamento criarPagamento() {
        return new Pix();
    }

    @Override
    public TermoPrivacidade criarTermoPrivacidade() {
        return new TermoLGPD();
    }
}