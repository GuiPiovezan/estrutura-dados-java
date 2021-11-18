package packages.Vetor.Teste;

import packages.Vetor.Vetor;

public class Aula09 {
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

        vetor.remove(1);

        System.out.println(vetor);

        vetor.remove(vetor.busca("E"));

        System.out.println(
            vetor
        );

        int posicao = vetor.busca("M");
        if(posicao >= 0 ){
            vetor.remove(posicao);
        }
        else {
            System.out.println("O elemento não existe no vetor");
        }

    }
}
