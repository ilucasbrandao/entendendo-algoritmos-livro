package cap1IntroducaoAAlgoritmos.desafio;

public class existePalavra {
    public static void existePalavra(String[] dicionario, String palavraBuscada){

        int inicio = 0;
        int fim = (dicionario.length) -1;

        while (inicio <= fim){
            int meio = (inicio + fim) / 2;
            String chute = dicionario[meio];

            int resultado = chute.compareToIgnoreCase(palavraBuscada);

            if (resultado == 0){
                System.out.println("Resultado: A palavra " + chute +" está correta e existe no dicionário!");
                return;
            }
            else if (resultado > 0) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }

        System.out.println("Resultado: A palavra " + palavraBuscada + " não foi encontrada. Você quis dizer outra coisa? ");
    }
}
