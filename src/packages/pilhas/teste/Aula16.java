package packages.pilhas.teste;

import packages.pilhas.Pilha;

public class Aula16 {
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<>();

        pilha.empilha("Guilherme");
        pilha.empilha("Sara");
        pilha.empilha("Matheus");
        pilha.empilha("Pedro");
        pilha.empilha("Reinaldo");

        System.out.println(pilha.topo());
        System.out.println(pilha);
    }
}
