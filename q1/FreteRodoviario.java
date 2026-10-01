import java.util.Arrays;
import java.util.List;

public class FreteRodoviario implements Frete {

    @Override
    public double calcularValor(double valorCarga) {
        return valorCarga * 0.02;
    }

    @Override
    public String getModalidade() {
        return "Rodoviário";
    }

    @Override
    public List<String> getDocumentos() {
        return Arrays.asList("CT-e", "MDF-e");
    }
}
