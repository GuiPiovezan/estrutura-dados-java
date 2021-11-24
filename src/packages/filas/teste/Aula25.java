package packages.filas.teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {
    public static void main(String[] args) {
        Queue<Paciente> filaPrioridade = new PriorityQueue<>();

        // filaPrioridade.add(1);
        // filaPrioridade.add(3);
        // filaPrioridade.add(2);

        filaPrioridade.add(new Paciente("A", 2));
        filaPrioridade.add(new Paciente("C", 1));
        filaPrioridade.add(new Paciente("B", 3));

        System.out.println(filaPrioridade);
    }
}
