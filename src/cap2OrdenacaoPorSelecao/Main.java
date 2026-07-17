package cap2OrdenacaoPorSelecao;

import java.util.ArrayList;
import java.util.List;
import static cap2OrdenacaoPorSelecao.ordenacao_por_selecao.ordenacaoPorSelecao;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaDeValores = new ArrayList<>(List.of(5, 6, 1, 221, 4, 125, 3, 19, 192, 33));

        System.out.println("Lista original: " + listaDeValores);
        List<Integer> listaOrdenada = ordenacaoPorSelecao(listaDeValores);
        System.out.println("Lista ordenada: " + listaOrdenada);    }
}
