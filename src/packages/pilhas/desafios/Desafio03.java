package packages.pilhas.desafios;

import packages.pilhas.Pilha;

public class Desafio03 {
    public static void main(String[] args) {
        System.out.println("25 decimal em binário " + conversaoBinario(25));
        System.out.println("144 decimal em binário " + conversaoBinario(144));
        System.out.println("256 decimal em binário " + conversaoBinario(256));
    }

    public static String conversaoBinario(int valor){

        Pilha<Integer> numeroBinario = new Pilha<>();
        StringBuilder stringBuilder = new StringBuilder();
 
        while(valor > 0){
            numeroBinario.empilha(valor % 2);
            valor /= 2;
        }

        while(!numeroBinario.estaVazia()){
            stringBuilder.append(numeroBinario.desempilhar());
        }

        return stringBuilder.toString();
    }
}
