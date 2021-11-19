package packages.Vetor.Teste;

import java.util.ArrayList;

import packages.Vetor.VetorGeneric;

public class Aula12 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("10");
        arrayList.add("20");

        if(arrayList.contains("10")){
            System.out.println("O elemento existe");
        } else {
            System.out.println("O elemento não existe");
        }

        VetorGeneric<String> vetor = new VetorGeneric<String>(10);

        vetor.adiciona("30");
        vetor.adiciona("80");
        vetor.adiciona("120");

        if(vetor.contem("120")){
            System.out.println("O elemento existe");
        } else {
            System.out.println("Não existe elemento");
        }
        
    }
}
