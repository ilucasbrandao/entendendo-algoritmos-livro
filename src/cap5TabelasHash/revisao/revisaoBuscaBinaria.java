package cap5TabelasHash.revisao;

public class revisaoBuscaBinaria {
    public static void main(String[] args) {

        int[] valores = new int[] {1, 4, 16, 32, 64, 128, 256};
        System.out.println(buscaBinaria(3, valores));
        System.out.println(buscaBinaria(64, valores));
        System.out.println(buscaBinaria(256, valores));

    }

    public static int buscaBinaria(int busca, int[] valores){

        int baixo = 0;
        int alto = valores.length-1;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            int chute = valores[meio];

            if(chute == busca){
                return meio;
            } else if(chute < busca){
                baixo = meio + 1;
            } else {
                alto = meio - 1;
            }
        }
        return -1;
    }
}
