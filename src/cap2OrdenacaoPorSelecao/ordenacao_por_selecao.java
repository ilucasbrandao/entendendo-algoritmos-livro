package cap2OrdenacaoPorSelecao;

import java.util.ArrayList;
import java.util.List;
import static cap2OrdenacaoPorSelecao.buscarMenorIndice.buscarMenorIndice;

public class ordenacao_por_selecao {

    public static List<Integer> ordenacaoPorSelecao(List<Integer> arr) {

        List<Integer> novoArr = new ArrayList<>();
        int tamanhoOriginal = arr.size();

        for (int i = 0; i < tamanhoOriginal; i++) {
            int menorIndice = buscarMenorIndice(arr);
            novoArr.add(arr.remove(menorIndice));
        }

        return novoArr;
    }
}