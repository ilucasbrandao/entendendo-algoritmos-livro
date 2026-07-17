package cap1IntroducaoAAlgoritmos;
import java.util.Scanner;


public class pesquisa_binaria {

    void main(String[] args) {

        // 1. O CONTEXTO: A pesquisa binária EXIGE que a lista esteja ordenada.
        int[] listaDeValores = new int[]{1, 5, 13, 34, 56, 61, 76, 88, 99, 100};

        // 2. OS PONTEIROS: Eles definem os limites de onde estamos procurando na lista.
        int baixo = 0;                          // Começa no primeiro índice (0)
        int alto = (listaDeValores.length) - 1; // Começa no último índice (9)

        Scanner input = new Scanner(System.in);
        System.out.println("Iniciando uma pesquisa binária");
        System.out.println("Informe um valor para localizarmos: ");
        int item = input.nextInt();

        // 3. O LOOP: Enquanto o espaço de busca não se fechar (baixo cruzar com alto), continuamos procurando.
        while (baixo <= alto) {

            // Encontra o meio exato do espaço de busca atual.
            // Em Java, a divisão de inteiros descarta as casas decimais (arredonda para baixo).
            int meio = (baixo + alto) / 2;

            // Fazemos o nosso "palpite" pegando o valor que está exatamente no meio.
            int chute = listaDeValores[meio];

            // CASO 1: Acertamos de primeira!
            if (chute == item) {
                System.out.println("Valor encontrado no indice: " + meio);
                return; // Encerra o método inteiro, pois o objetivo foi alcançado.
            }

            // CASO 2: O nosso chute foi alto demais.
            // Se o chute é maior que o item, o item só pode estar na METADE ESQUERDA.
            else if (chute > item) {
                // Se o item está à esquerda, o nosso novo limite "alto" passa a ser
                // uma posição antes do meio que testamos. Ignoramos o meio e tudo à direita dele.
                alto = meio - 1;
            }

            // CASO 3: O nosso chute foi baixo demais (chute < item).
            // Se o chute é menor que o item, o item só pode estar na METADE DIREITA.
            else {
                // Se o item está à direita, o nosso novo limite "baixo" passa a ser
                // uma posição depois do meio que testamos. Ignoramos o meio e tudo à esquerda dele.
                baixo = meio + 1;
            }
        }

        // 4. FIM DA BUSCA: Se o loop terminou e não deu 'return', significa que 'baixo'
        // superou 'alto' e o espaço de busca sumiu. Logo, o número não existe na lista.
        System.out.println("Valor não consta na lista");
        input.close();
    }
}
