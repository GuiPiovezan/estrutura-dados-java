package packages.Vetor.Teste;

import packages.Vetor.Vetor;

public class Aula08 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(7);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");

        System.out.println(vetor);

        vetor.adiciona(0, "A");

        System.out.println(vetor);


        vetor.adiciona(3, "D");

        System.out.println(vetor);

        vetor.adiciona("H");

        System.out.println(vetor);
    }
}
