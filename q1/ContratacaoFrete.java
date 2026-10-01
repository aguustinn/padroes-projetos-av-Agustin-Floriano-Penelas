public abstract class ContratacaoFrete {

    protected abstract Frete criarFrete();

    public void contratar(String nomeCliente, double valorCarga) {
        Frete frete = criarFrete();

        double valorFrete = frete.calcularValor(valorCarga);

        System.out.println("=== Resumo da Contratação ===");
        System.out.println("Modalidade: " + frete.getModalidade());
        System.out.println("Cliente: " + nomeCliente);
        System.out.printf("Valor do frete: R$ %.2f%n", valorFrete);
        System.out.println("Documentos exigidos: ");
        System.out.println(frete.getDocumentos());
    }
}
