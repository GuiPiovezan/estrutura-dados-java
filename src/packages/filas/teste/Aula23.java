package packages.filas.teste;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();

        fila.add(1);
        fila.add(2);
        fila.add(3);

        System.out.println(fila);
        System.out.println("Espiando o início da fila " + fila.peek());
        System.out.println("Desinfileirando " + fila.remove());
        System.out.println(fila);
    }
}
