package cap1IntroducaoAAlgoritmos.desafio;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

// Importando os métodos que você criou (ajustados para aceitar List)
import static cap1IntroducaoAAlgoritmos.desafio.bugDoJogo.existePlayerId;
import static cap2OrdenacaoPorSelecao.ordenacao_por_selecao.ordenacaoPorSelecao;

public class CorretorOrto {
    public static void main(String[] args) {

        // 1. Gerando os 1000 IDs direto como uma Lista Dinâmica (List<Integer>)
        Random random = new Random();
        List<Integer> playersIds = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            // Gera números entre 1 e 5000 e adiciona na lista
            playersIds.add(random.nextInt(1000) + 1);
        }

        Scanner input = new Scanner(System.in);

        System.out.println("=== VALIDADOR DE ID E PERFORMANCE DESDE O ZERO ===");

        System.out.print("Digite o ID do jogador para buscar: ");
        int idDoUsuario = input.nextInt();

        System.out.println("\n[Debug] Lista de IDs originais (Desordenados):");
        System.out.println(playersIds); // O Java já printa Listas de forma bonita automaticamente entre []

        // 2. CORREÇÃO CRUCIAL: A ordenação por seleção gera um NOVO array ordenado.
        // Precisamos receber esse novo array e guardá-lo.
        System.out.println("\n[Processando] Ordenando 1.000 itens com Ordenação por Seleção O(n²)... Aguarde.");
        List<Integer> idsOrdenados = ordenacaoPorSelecao(playersIds);

        System.out.println("\n[Debug] Lista de IDs após Ordenação por Seleção:");
        System.out.println(idsOrdenados);

        // 3. Agora passamos a lista PERFEITAMENTE ORDENADA para a Pesquisa Binária brilhar
        System.out.println("\n[Processando] Buscando o ID com Pesquisa Binária O(log n)...");
        existePlayerId(idsOrdenados, idDoUsuario);

        input.close();
    }
}