public class ContratacaoFreteMaritimo extends ContratacaoFrete {

    @Override
    protected Frete criarFrete() {
        return new FreteMaritimo();
    }
}
