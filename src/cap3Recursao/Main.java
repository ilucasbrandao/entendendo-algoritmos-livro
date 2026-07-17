package cap3Recursao;

public class Main {
    public static void main(String[] args) {
        // casoBaseCasoRecursivo(10);
        // System.out.println("Fatorial de 5 é: " + fatorial(5));
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Soma dos elementos do array é: " + somandoElementos(array, array.length));

        int[] array2 = { 12, 5 , 3, 23, 7, 65, 1, 18,9, 5};
        System.out.println("Maior elemento do 'array2' é: " + encontrarMaiorElemento(array2, array2.length));

        String str = "arara";
        System.out.println("A string '" + str + "' é um palíndromo? " + verificarPalindromo(str));

    }

    public static boolean casoBaseCasoRecursivo(int num) {
        System.out.println(num);

        // CASO BASE - Quando o número for menor ou igual a 1, a função retorna FALSE e não chamará mais a função recursiva.
        if (num <= 1) {
            return false;
        }

        // CASO RECURSIVO - Quando o número for maior que 1, a função chamará a si mesma com o número decrementado em 1.
        else {
            casoBaseCasoRecursivo(num - 1);
        }
        return false;
    }

    public static int fatorial(int num){
        // CASO BASE - Quando o número for igual a 1, a função retorna 1 e não chamará mais a função recursiva.
        if(num == 1 ){
            return 1;
        }
        else {
            System.out.println("DEBUG: " + num);
            // CASO RECURSIVO - Enquanto o número for maior que 1, a função chamá a si mesma com o numero decrementado em 1.
            return num * fatorial(num - 1);
        }
    }

    public static int somandoElementos(int[] array, int num){
        if (num == 0) {
            // CASO BASE - Quando o número for igual a 0, a função retorna 0 e não chamará mais a função recursiva.
            return 0;
        } else {
            // CASO RECURSIVO - Enquanto o número for maior que 0, a função chamará a si mesma com o número decrementado em 1.
            return array[num - 1] + somandoElementos(array, num - 1);
        }
    }

    public static int encontrarMaiorElemento(int[] array, int num) {
        if(num == 1) {
            return array[0];
        }
        else {
            int maior = encontrarMaiorElemento(array, num - 1);
            if(array[num -1] > maior) {
                return array[num - 1];
            } else {
                return maior;
            }
        }
    }

    public static boolean verificarPalindromo(String str) {
        // CASO BASE - Quando a string tiver tamanho 0 ou 1, a função retorna TRUE e não chamará mais a função recursiva.
        if (str.length() <= 1) {
            return true;
        }
        // CASO RECURSIVO - Enquanto a string tiver tamanho maior que 1, a função chamará a si mesma com a substring da string, removendo o primeiro e o último caractere.
        else {
            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                return verificarPalindromo(str.substring(1, str.length() - 1));
            } else {
                return false;
            }
        }
    }

    // Me dê sugestoes de desafios de recursão para praticar, por favor.
    // 1. Calcular a soma dos elementos de um array de inteiros.
    // 2. Verificar se uma string é um palíndromo.
    // 3. Encontrar o maior elemento em um array de inteiros.
}
