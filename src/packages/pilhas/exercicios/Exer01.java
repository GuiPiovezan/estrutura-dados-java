package packages.pilhas.exercicios;

import java.util.Scanner;

import packages.pilhas.Pilha;

public class Exer01 {
    public static void main(String[] args) {
        String msg;
        int valor;
        Scanner scanner = new Scanner(System.in);
        Pilha<Integer> pilha = new Pilha<>();
        
        for(int i = 0; i<10; i++){
            msg = "Escreva o " + (i+1) + "º número";
            valor = Integer.parseInt(leDados(scanner, msg));
            if( valor % 2 == 0){
                pilha.empilha(valor);
            } else {
                pilha.desempilhar();
            }
        }

        System.out.println("Conteúdo da pilha: " + pilha);

        
        if(pilha.estaVazia()){
            System.out.println("Pilha vazia");
        } else {
            for(int i = pilha.getTamanho() - 1; i > -1; i--){
                System.out.println(pilha.desempilhar());
            }
        }

        
    }

    public static String leDados(Scanner scanner, String msg){
        System.out.println(msg);
        var dado = scanner.nextLine();

        return dado;
    }
}
