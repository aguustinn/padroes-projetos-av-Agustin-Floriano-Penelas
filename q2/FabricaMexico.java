public class FabricaMexico implements FabricaArtefatos {

    @Override
    public ComprovanteFiscal criarComprovanteFiscal() {
        return new Cfdi();
    }

    @Override
    public Pagamento criarPagamento() {
        return new Spei();
    }

    @Override
    public TermoPrivacidade criarTermoPrivacidade() {
        return new TermoLFPDPPP();
    }
}