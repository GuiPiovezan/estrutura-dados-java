package packages.filas.teste;

import packages.filas.Fila;

public class Aula20 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        fila.enfileirar(2);
        fila.enfileirar(6);
        fila.enfileirar(10);
        fila.enfileirar(122);
        fila.enfileirar(22);

        System.out.println(fila);
    }
}
