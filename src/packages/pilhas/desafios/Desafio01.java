package packages.pilhas.desafios;

import java.util.Scanner;
import java.util.Stack;

public class Desafio01 {
    public static void main(String[] args) {
        //Palíndromo
        /* subinoonibus, hannah */

        Scanner scanner = new Scanner(System.in);
        Stack<String> pilhaPalavra = new Stack<>();

        System.out.print("Digite uma palavra ou frase para verifciar se é um palíndromo: ");
        var palavra = scanner.nextLine();

        String[] letras = palavra.replaceAll(" ", "").split("");
        
        

        for(int i = 0; i < letras.length; i++){
            pilhaPalavra.add(letras[i]);
        }

        
        String[] letrasDecrescente = new String[pilhaPalavra.size() / 2]; 

       
        for( int i = 0; i <= ((letras.length) / 2) - 1; i++){
            letrasDecrescente[i] = pilhaPalavra.pop();
        }

        boolean isPalindromo = true;
        
        for( int i = 0; i < letrasDecrescente.length; i++ ){
            if(!letrasDecrescente[i].equals(pilhaPalavra.get(i))){
                isPalindromo = false;
                break;
            }
        }

        if(isPalindromo){
            System.out.println(palavra + " é um palíndromo");
        } else {
            System.out.println(palavra + " não é um palíndromo");
        }
    }
}
