public class ContratacaoFreteRodoviario extends ContratacaoFrete {

    @Override
    protected Frete criarFrete() {
        return new FreteRodoviario();
    }
}
