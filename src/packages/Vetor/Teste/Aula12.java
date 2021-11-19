package packages.Vetor.Teste;

import java.util.ArrayList;

import packages.Vetor.VetorGeneric;

public class Aula12 {
    public static void main(String[] args) {
        // ArrayList<String> arrayList = new ArrayList<String>();

        // arrayList.add("10");
        // arrayList.add("20");
        // arrayList.add("40");
        // arrayList.add("120");
        // arrayList.add("240");
        // arrayList.clear();

        // System.out.println(arrayList);

        // if(arrayList.contains("10")){
        //     System.out.println("O elemento existe");
        // } else {
        //     System.out.println("O elemento não existe");
        // }

        // System.out.println(arrayList.lastIndexOf("350"));

        // VetorGeneric<String> vetor = new VetorGeneric<>(10);

        // vetor.adiciona("30");
        // vetor.adiciona("80");
        // vetor.adiciona("120");

        // if(vetor.contem("120")){
        //     System.out.println("O elemento existe");
        // } else {
        //     System.out.println("Não existe elemento");
        // }


        // System.out.println(vetor.ultimoIndice("450"));

        // vetor.remove("30");
        // System.out.println(vetor);

        // //vetor.remove("450");

        // System.out.println(vetor.obtem(0));

        // vetor.adiciona("200");
        // vetor.adiciona("300");
        // vetor.adiciona("8000000000");

        // System.out.println(vetor);

        // vetor.limpar();

        // System.out.println(vetor);


        VetorGeneric<Contato> vetorGeneric = new VetorGeneric<>(3);

        Contato c1 = new Contato();
        c1.setNome("Guilherme");
        c1.setEmail("guilherme.piovezan00@gmail.cm");
        c1.setTelefone("17 991380595");

        Contato c2 = new Contato();
        c2.setNome("Sara");
        c2.setEmail("sara@gmail.cm");
        c2.setTelefone("17 991380595");
        
        Contato c3 = new Contato();
        c3.setNome("Reinaldo");
        c3.setEmail("reinaldo@gmail.cm");
        c3.setTelefone("17 991380595");

        Contato c4 = new Contato();
        c4.setNome("Pedro");
        c4.setEmail("pedro@gmail.cm");
        c4.setTelefone("17 991380595");

        Contato c5 = new Contato();
        c5.setNome("Matheus");
        c5.setEmail("matheus@gmail.cm");
        c5.setTelefone("17 991380595");

        vetorGeneric.adiciona(c1);
        vetorGeneric.adiciona(c2);
        vetorGeneric.adiciona(c3);
        vetorGeneric.adiciona(c4);
        vetorGeneric.adiciona(c5);

        // System.out.println(vetorGeneric);

       System.out.println(vetorGeneric.busca(0)); 

       System.out.println(vetorGeneric.busca(c3));
        
        
    }
}
