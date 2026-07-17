package cap2OrdenacaoPorSelecao;

import java.util.List;

public class buscarMenorIndice {

    public static int buscarMenorIndice(List<Integer> arr){
        int menor = arr.get(0); // pega o menor indice;
        int menorIndice = 0;

        for (int i = 0; i < arr.size(); i++){
            if(arr.get(i) < menor){
                menor = arr.get(i); // Pega o valor do indice
                menorIndice = i; // Pega o indice
            }
        }
        return menorIndice;
    }
}
