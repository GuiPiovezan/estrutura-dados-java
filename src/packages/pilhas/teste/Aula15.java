package packages.pilhas.teste;

import packages.pilhas.Pilha;

public class Aula15 {
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<>();

        System.out.println(pilha.estaVazia());

        pilha.empilha("1");

        System.out.println(pilha.estaVazia());
    }
}
