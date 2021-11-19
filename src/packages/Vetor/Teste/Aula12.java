package packages.Vetor.Teste;

import java.util.ArrayList;

import packages.Vetor.VetorGeneric;

public class Aula12 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("10");
        arrayList.add("20");
        arrayList.add("40");
        arrayList.add("120");
        arrayList.add("240");
        arrayList.clear();

        System.out.println(arrayList);

        if(arrayList.contains("10")){
            System.out.println("O elemento existe");
        } else {
            System.out.println("O elemento não existe");
        }

        System.out.println(arrayList.lastIndexOf("350"));

        VetorGeneric<String> vetor = new VetorGeneric<>(10);

        vetor.adiciona("30");
        vetor.adiciona("80");
        vetor.adiciona("120");

        if(vetor.contem("120")){
            System.out.println("O elemento existe");
        } else {
            System.out.println("Não existe elemento");
        }


        System.out.println(vetor.ultimoIndice("450"));

        vetor.remove("30");
        System.out.println(vetor);

        //vetor.remove("450");

        System.out.println(vetor.obtem(0));

        vetor.adiciona("200");
        vetor.adiciona("300");
        vetor.adiciona("8000000000");

        System.out.println(vetor);

        vetor.limpar();

        System.out.println(vetor);
        
    }
}
