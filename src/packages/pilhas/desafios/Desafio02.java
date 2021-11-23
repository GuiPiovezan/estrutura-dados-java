package packages.pilhas.desafios;

import java.util.Stack;

public class Desafio02 {
    public static void main(String[] args) {
        exibiResultado();
    }

    public static void exibiResultado(){
        System.out.println("A equação " + (testaExpressaoMatematica("((A+B) + D)") ? "está balanceada" : "não está balanceada"));
        System.out.println("A equação "+ (testaExpressaoMatematica("((A+B)") ? "está balanceada" : "não está balanceada"));
        System.out.println("A equação "+ (testaExpressaoMatematica("A + B(") ? "está balanceada" : "não está balanceada"));
    }

    public static boolean testaExpressaoMatematica(String valor){

        var expressaoMatematica = valor.replaceAll(" ", "").split("");
        Stack<String> simbolosMatematicos = new Stack<>();

        for(int i = 0; i < expressaoMatematica.length; i++){
            if(expressaoMatematica[i].equals("(") || expressaoMatematica[i].equals(")")){
                simbolosMatematicos.add(expressaoMatematica[i]);
            }
        }

        var tamanhoSimbolosMatematicos = simbolosMatematicos.size();

        String[] metadeSimbolosMatematicos = new String[simbolosMatematicos.size() / 2];
        var count = 0;
        if(tamanhoSimbolosMatematicos % 2 == 0){
            for(int i = 0; i < (tamanhoSimbolosMatematicos / 2); i++){
                metadeSimbolosMatematicos[i] = simbolosMatematicos.pop();
                if(simbolosMatematicos.get(i).equals("(") && metadeSimbolosMatematicos[i].equals(")")){
                    count++;
                }
            }

            if(count == tamanhoSimbolosMatematicos / 2){
                return true;
            }
        }   
        return false;
    }
}
