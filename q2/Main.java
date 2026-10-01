public class Main {

    public static void main(String[] args) {

        System.out.println("=== ASSINATURA BRASIL ===");

        FabricaArtefatos fabricaBrasil = new FabricaBrasil();
        Assinatura assinaturaBrasil = new Assinatura(fabricaBrasil);

        assinaturaBrasil.relatorio();

        System.out.println();

        System.out.println("=== ASSINATURA MÉXICO ===");

        FabricaArtefatos fabricaMexico = new FabricaMexico();
        Assinatura assinaturaMexico = new Assinatura(fabricaMexico);

        assinaturaMexico.relatorio();
    }
}