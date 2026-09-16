package cap5TabelasHash.revisao;

public class revisaoBuscaSimples {
    // 1. Corrigido para 'public static void main'
    public static void main(String[] args) {
        int[] valores = new int[] {1, 4, 16, 32, 64, 128, 256};

        System.out.println("Índice encontrado: " + buscaSimples(3, valores));
        System.out.println("Índice encontrado: " + buscaSimples(64, valores));
    }

    public static int buscaSimples(int busca, int[] listaDeValores) {
        for (int i = 0; i < listaDeValores.length; i++) {
            if (listaDeValores[i] == busca) {
                return i;
            }
        }
        return -1;
    }
}
