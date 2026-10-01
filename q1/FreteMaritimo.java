import java.util.Arrays;
import java.util.List;

public class FreteMaritimo implements Frete {

    @Override
    public double calcularValor(double valorCarga) {
        return valorCarga * 0.01;
    }

    @Override
    public String getModalidade() {
        return "Marítimo";
    }

    @Override
    public List<String> getDocumentos() {
        return Arrays.asList("BL (Bill of Lading)", "Fatura comercial");
    }
}
