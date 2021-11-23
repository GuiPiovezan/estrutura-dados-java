package packages.pilhas.exercicios;

import java.util.Scanner;

import packages.pilhas.Pilha;

public class Exer02{
    public static void main(String[] args) {
        String msg;
        int valor;
        Scanner scanner = new Scanner(System.in);
        Pilha<Integer> pilhaPar = new Pilha<>();
        Pilha<Integer> pilhaImpar = new Pilha<>();
        
        for(int i = 0; i<10; i++){
            msg = "Escreva o " + (i+1) + "º número";
            valor = Integer.parseInt(leDados(scanner, msg));

            if(valor == 0){
                if(!pilhaPar.estaVazia() || !pilhaImpar.estaVazia()){
                    System.out.println("Desempilhando pares e ímpares");
                    pilhaPar.desempilhar();
                    pilhaImpar.desempilhar();
                } else {
                    System.out.println("As pilha par ou ímpares já se encontram vazias");
                }
            } else if( valor % 2 == 0){
                pilhaPar.empilha(valor);
            } else {
                pilhaImpar.empilha(valor);
            }
        }

        System.out.println("Conteúdo pares: " + pilhaPar +"\nConteúdo ímpares: "+pilhaImpar);

        // for(int i = 0; i<5; i++){
        //     System.out.println("\nDesempilhando par: "+pilhaPar.desempilhar());
        //     System.out.println("\nDesempilhando ímpar: "+pilhaImpar.desempilhar());
        // }

        while(!pilhaPar.estaVazia()){
            System.out.println("\nDesempilhando par: "+pilhaPar.desempilhar());
        }

        while(!pilhaImpar.estaVazia()){
            System.out.println("\nDesempilhando ímpar: "+pilhaImpar.desempilhar());
        }
    }


    public static String leDados(Scanner scanner, String msg){
        System.out.println(msg);
        var dado = scanner.nextLine();

        return dado;
    }
}