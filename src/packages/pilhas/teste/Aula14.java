package packages.pilhas.teste;

import packages.pilhas.Pilha;

public class Aula14 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        pilha.empilha(1);
        pilha.empilha(10);
        pilha.empilha(5);
        pilha.empilha(3);
        System.out.println(pilha);
        System.out.println(pilha.getTamanho());
    }
}
