package packages.filas.teste;

import packages.filas.Fila;
import packages.filas.FilaPrioridade;

public class Aula24 {
    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        fila.enfileirar(1);
        fila.enfileirar(3);
        fila.enfileirar(2);


        FilaPrioridade<Paciente> filaPrioridade = new FilaPrioridade<>();

        // filaPrioridade.enfileirar(1);
        // filaPrioridade.enfileirar(3);
        // filaPrioridade.enfileirar(2);

        System.out.println(fila);
        System.out.println(filaPrioridade);

        filaPrioridade.enfileirar(new Paciente("A" , 2));
        filaPrioridade.enfileirar(new Paciente("C" , 1));
        filaPrioridade.enfileirar(new Paciente("B" , 3));

        System.out.println(filaPrioridade);
    }
}
