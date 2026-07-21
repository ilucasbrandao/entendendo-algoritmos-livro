package cap4Quicksort.exercicios;

import java.util.List;

public class somandoArray {
    public static int somandoArray(List<Integer> arr) {
        if(arr.isEmpty()){
            return 0;
        } else {
           int primeiroEl = arr.removeFirst();
            return primeiroEl + somandoArray(arr);
        }
    }
}
