import java.util.List;

public interface Frete {

    double calcularValor(double valorCarga);

    String getModalidade();

    List<String> getDocumentos();
}
