package packages.vetor.teste;

import packages.vetor.VetorObjetos;

public class Aula10 {
    public static void main(String[] args) {
        Contato contato = new Contato("Guilherme", "guilherme@email.com", "179874-6598");
        Contato contato2 = new Contato("Lais", "lais@email.com", "179974-6598");
        Contato contato3 = new Contato("Melissa", "melissa@email.com", "179814-6598");

        VetorObjetos vetorObjetos = new VetorObjetos(3);

        vetorObjetos.adiciona(contato);
        vetorObjetos.adiciona(contato2);
        vetorObjetos.adiciona(contato3);

        System.out.println(vetorObjetos);
    }
}
