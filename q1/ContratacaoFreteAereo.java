public class ContratacaoFreteAereo extends ContratacaoFrete {

    @Override
    protected Frete criarFrete() {
        return new FreteAereo();
    }
}
