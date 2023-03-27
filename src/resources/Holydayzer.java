package resources;

import java.util.HashMap;
import java.util.Map;

public class Holydayzer {
     Map<String, String> feriados = new HashMap<>();

  public Holydayzer() {
    montaFeriados();
  }

  public void pegaFeriado(String feriado) {
    String pegaFeriado = feriados.get(feriado);

    if (pegaFeriado == null) {
      System.out.println("Esse feriado não existe!!");
      return;
    }

    System.out.println("A data " + feriado + " se refere ao feriado de " + pegaFeriado);

  }

  public void listaFeriados() {
    feriados.forEach((key, value) -> System.out.println("Data: " + key + " corresponde ao feriado: " + value));
  }

  public void montaFeriados() {
    feriados.put("01/01/2023", "Confraternização mundial");
    feriados.put("21/02/2023", "Carnaval");
    feriados.put("17/04/2023", "Páscoa");
    feriados.put("21/04/2023", "Tiradentes");
    feriados.put("01/05/2023", "Dia do trabalho");
    feriados.put("08/06/2023", "Corpus Christi");
    feriados.put("07/09/2023", "Independência do Brasil");
    feriados.put("12/10/2023", "Nossa Senhora Aparecida");
    feriados.put("02/11/2023", "Finados");
    feriados.put("15/11/2023", "Proclamação da República");
    feriados.put("25/12/2023", "Natal");
  }
}
