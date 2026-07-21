package cap4Quicksort.exercicios;

import java.util.List;

public class itensNaLIsta {
    public static int contaItensNaLista(List<?> arr){

        if (arr.isEmpty()){
            return 0;
        } else {
            return 1 + contaItensNaLista(arr.subList(1,arr.size()));
        }
    }
}
