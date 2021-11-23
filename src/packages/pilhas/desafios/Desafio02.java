package packages.pilhas.desafios;

import java.util.Stack;

public class Desafio02 {
    public static void main(String[] args) {
        exibiResultado();
    }

    public static void exibiResultado(){
        System.out.println("Os símbolos da equação estão " + (testaExpressaoMatematica("((A+B) + D)") ? "correta" : "errada"));
        System.out.println("Os símbolos da equação estão "+ (testaExpressaoMatematica("((A+B)") ? "correta" : "errada"));
        System.out.println("Os símbolos da equação estão "+ (testaExpressaoMatematica("A + B(") ? "correta" : "errada"));
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
            }

            for(int i = 0; i < tamanhoSimbolosMatematicos / 2; i++){
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
