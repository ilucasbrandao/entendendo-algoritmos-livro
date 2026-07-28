package cap4Quicksort;

import java.util.ArrayList;
import java.util.List;

public class Quicksort {
    public static List<Integer> quicksort(List<Integer> arr){
        if(arr.size() < 2){ // CASO-BASE = se o tamanho do array for 0 || 1, ele retorna ele mesmo.
            return arr;
        }
        // CASO RECURSIVO = uma vez que o array tem mais de 1 elemento,
        // ele escolhe um pivo e separa os elementos em dois arrays: menores e maiores que o pivo.
        ArrayList<Integer> menores = new ArrayList<>();
        ArrayList<Integer> maiores = new ArrayList<>();
        int pivo = arr.getFirst();

        for (int i = 1; i < arr.size(); i++) {
        int valor = arr.get(i);
            if(valor > pivo){
                maiores.add(valor);
            } else {
                menores.add(valor);
            }
            }

        List<Integer> resultado = new ArrayList<>(quicksort(menores)); // o resultado é a junção do quicksort dos menores, o pivo e o quicksort dos maiores.
        resultado.add(pivo);
        resultado.addAll(quicksort(maiores));

        return resultado;
    }
}
