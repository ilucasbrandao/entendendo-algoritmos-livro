package cap4Quicksort;
import cap4Quicksort.exercicios.IndexMaisAlto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static cap4Quicksort.exercicios.IndexMaisAlto.MaiorValor;
import static cap4Quicksort.exercicios.itensNaLIsta.contaItensNaLista;
import static cap4Quicksort.exercicios.somandoArray.somandoArray;

public class Main {
    public static void main(String[] args) {

        List<Integer> array1 = new ArrayList<>(List.of(2, 4, 6));
        System.out.println(somandoArray(array1));
        ArrayList<String> listaDeCompras = new ArrayList<>(Arrays.asList("macarrao", "arroz", "feijao", "carne", "refri"));

        System.out.println("Contando Itens na lista de compras: " + contaItensNaLista(listaDeCompras));

        // Exercicio de Busca do Maior Valor em um Array
        ArrayList<Integer> randomNumbers = new ArrayList<>(Arrays.asList(1,8,6,4,12,55,3,13,25));
        System.out.println("O maior valor é: " + MaiorValor(randomNumbers));
    }
}