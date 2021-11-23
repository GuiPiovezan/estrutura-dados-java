package packages.pilhas.exercicios;

import java.text.SimpleDateFormat;

import packages.pilhas.Pilha;

public class Exer03 {
    public static void main(String[] args) {
        Pilha<Livro> pilhaLivros = new Pilha<>(20);
        
        SimpleDateFormat formatador = new SimpleDateFormat("yyyy");
        

        Livro harryPotter = new Livro();
        harryPotter.setNome("Harry Potter e a Pedra Filosofal");
        harryPotter.setIsbn("9781781103685");
        harryPotter.setAnoLancamento(formatador.format(1997));
        harryPotter.setAutor("J. K. Rowling");

        Livro aCulpaDasEstrelas = new Livro("A culpa é das estrelas", "9788580572261", formatador.format(2012), "John Green");
        Livro aVidaInvisivel = new Livro("A vida invisível de Addie LaRue", "9786555872552", formatador.format(2021), "V.E. Schwab");
        Livro aristotelesDante = new Livro("Livro - Aristóteles e Dante descobrem os segredos do Universo", "9788565765350",formatador.format(2014), "Benjamin Alire Sáenz");
        Livro mulheresComLobos = new Livro("Mulheres Que Correm Com Os Lobos", "9788532529787", formatador.format(2018), "CLARISSA PINKOLA ESTÉS");
        Livro lugaresIncriveis = new Livro("Por lugares incríveis", "9788565765572", formatador.format(2015), "Jennifer Niven");

        pilhaLivros.empilha(harryPotter);
        pilhaLivros.empilha(aCulpaDasEstrelas);
        pilhaLivros.empilha(aVidaInvisivel);
        pilhaLivros.empilha(aristotelesDante);
        pilhaLivros.empilha(mulheresComLobos);
        pilhaLivros.empilha(lugaresIncriveis);


        System.out.println(pilhaLivros);
    }
}
