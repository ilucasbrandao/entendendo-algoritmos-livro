package cap5TabelasHash.main;

import java.util.HashMap;

public class cache {
     static HashMap<String, Boolean> dados = new HashMap<>();

    public static void main(String[] args) {

        Buscar_pagina("Facebook");
        Buscar_pagina("Instagram");
        Buscar_pagina("Twitter");
        Buscar_pagina("Facebook");
        System.out.println(dados);
    }

    public static void Buscar_pagina(String nome){
        if(dados.containsKey(nome)){
            System.out.println("A página " + nome + " já está disponível no cache: ");
        } else {
            dados.put(nome, true);
            System.out.println("Página adicinada no cache: " + nome);
        }
    }
}
