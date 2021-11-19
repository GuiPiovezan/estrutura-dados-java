package packages.vetor.teste;

import packages.vetor.Vetor;

public class Aula05 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        vetor.adiciona("Sara");
        vetor.adiciona("Guilherme");
        vetor.adiciona("Pedro");
        vetor.adiciona("Matheus");
        vetor.adiciona("Reinaldo");

        System.out.println(vetor.getTamanho());
        System.out.println(vetor);
        System.out.println(vetor.busca(4));
    }
}
