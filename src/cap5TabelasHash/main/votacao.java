package cap5TabelasHash.main;

import java.util.HashMap;

public class votacao {
    static HashMap<String, Boolean> votaram = new HashMap<>();
    public static void main(String[] args) {

        votar("Lucas");
        votar("Julianne");
        votar("Sophia");
        votar("Lucas");
    }

    public static void votar(String nome){
        if (votaram.containsKey(nome)){
            System.out.println("Não poderá votar novamente!");
            return;
        } else {
            votaram.put(nome, true);
            System.out.println("A pessoa " + nome + " votou!");
        }
    }
}
