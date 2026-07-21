package cap4Quicksort.exercicios;

import java.util.List;

public class IndexMaisAlto {
    public static int MaiorValor(List<Integer> arr) {
        if(arr.isEmpty()){
            return Integer.MIN_VALUE;
        } else if (arr.size() == 1) {
            return arr.getFirst();
        }

        // guarda o primeiro valor
        int primeiroIndex = arr.getFirst();

        // chama a função recursiva, eliminando o primeiro valor e pegando os demais
        int maiorDoResto = MaiorValor(arr.subList(1, arr.size()));

        // após reservar todos os valores, começa a fazer os comparativos
        if (primeiroIndex > maiorDoResto) {
            return primeiroIndex;
        } else {
             return maiorDoResto;
        }
    }
}
