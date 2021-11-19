package packages.vetor.teste;

import packages.vetor.VetorGeneric;

public class Aula11 {
    public static void main(String[] args) {
        VetorGeneric<String> vetor = new VetorGeneric<String>(4);

        vetor.adiciona("1");
        vetor.adiciona("Guilherme");

        System.out.println(vetor);
    }
}
