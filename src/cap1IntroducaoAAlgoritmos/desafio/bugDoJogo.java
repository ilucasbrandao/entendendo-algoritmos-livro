package cap1IntroducaoAAlgoritmos.desafio;

import java.util.List;

public class bugDoJogo {
    public static void existePlayerId(List<Integer> idsJogadores, int numeroDoID) {
        int inicio = 0;
        int fim = (idsJogadores.size()) - 1;

        int meio = (inicio + fim) / 2;

        int chute = idsJogadores.get(meio);

        if (chute == numeroDoID) {
            System.out.println("Resultado: O ID do jogador " + chute +" está correta e existe no servidor!");
            return;
        }

        else if(chute > numeroDoID){
            fim = meio - 1;
        }

        else {
            inicio = meio + 1;
        }

        System.out.println("Resultado: O ID " + numeroDoID + " não foi encontrado. Você quis dizer outra ID de jogador? ");

    }
}
