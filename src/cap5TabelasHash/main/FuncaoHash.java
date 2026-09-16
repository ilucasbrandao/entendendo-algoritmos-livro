package cap5TabelasHash.main;

import java.util.HashMap;

public class FuncaoHash {
    public static void main(String[] args) {

        HashMap<String, Double> caderno_de_contas = new HashMap<>();
        HashMap<String, Integer> lista_telefonica = new HashMap<>();

        caderno_de_contas.put("maçã", 0.67);
        caderno_de_contas.put("leite", 1.49);
        caderno_de_contas.put("abacate", 1.49);

        // lista telefônia
        lista_telefonica.put("Juh",997359736);
        lista_telefonica.put("Eduardo", 99682992);

        System.out.println(caderno_de_contas.get("leite"));
        System.out.println(caderno_de_contas);

        System.out.println(lista_telefonica.get("Eduardo"));
    }
}
