package packages.pilhas.desafios;

import java.util.Stack;

import packages.pilhas.Pilha;

public class Desafio03 {
    public static void main(String[] args) {
        System.out.println("25 decimal em binário " + conversaoBinario(25));
        System.out.println("144 decimal em binário " + conversaoBinario(144));
        System.out.println("256 decimal em binário " + conversaoBinario(256));
        imprimeResultadoQualquerBase(25, 2);
        imprimeResultadoQualquerBase(25, 8);
        imprimeResultadoQualquerBase(25, 16);
        imprimeResultadoQualquerBase(536, 16);
        imprimeResultadoQualquerBase(1025699, 16);
    }

    public static void imprimeResultadoQualquerBase(int numero, int base){
		System.out.println(numero + " na base " + base + 
				" é: " + decimalQualquerBase(numero, base));
	}

    public static String conversaoBinario(int valor){

        Pilha<Integer> numeroBinario = new Pilha<>();
        StringBuilder stringBuilder = new StringBuilder();
 
        while(valor > 0){
            numeroBinario.empilha(valor % 2);
            valor /= 2;
        }

        while(!numeroBinario.estaVazia()){
            stringBuilder.append(numeroBinario.desempilhar());
        }

        return stringBuilder.toString();
    }

    public static String decimalQualquerBase(int numero, int base){
		
		if (base > 16){
			throw new IllegalArgumentException();
		}

		Stack<Integer> pilha = new Stack<>();
		String numBase = "";
		int resto;
		String bases = "0123456789ABCDEF";

		while (numero > 0){
			resto = numero % base;
			pilha.push(resto);
			numero /= base;
		}

		while (!pilha.isEmpty()){
			numBase += bases.charAt(pilha.pop());
		}

		return numBase;
	}
}
