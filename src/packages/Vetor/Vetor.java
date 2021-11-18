package packages.Vetor;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Vetor{

    private String[] elementos;
    private int      tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho   = 0;
    }

    // public void adiciona(String elemento){
    //     for(int i = 0; i < this.elementos.length; i++){
    //         if(this.elementos[i] == null){
    //             this.elementos[i] = elemento;
    //             break;
    //         }
    //     }
    // }

    // public void adiciona(String elemento) throws Exception{
    //     if(this.tamanho < this.elementos.length){
    //         this.elementos[this.tamanho] = elemento;
    //         this.tamanho++;
    //     } else {
    //         throw new Exception("Array já contém valor suficientes");
    //     }
    // }

    public boolean adiciona(String elemento) {
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } 
        return false;
    }

    public String busca(int posicao){
        
        if(!(posicao >=0 && posicao < this.tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(String elemento){

        for(int i = 0; i < this.tamanho; i++){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }

        return -1;
    }

    public int getTamanho(){
        return this.tamanho;
    }

    @Override
    public String toString(){

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("[");

        for(int  i = 0; i < this.tamanho; i++){
            stringBuilder.append(this.elementos[i]);
            stringBuilder.append(", ");
        }

        if(this.tamanho > 0){
            stringBuilder.append(this.elementos[this.tamanho - 1]);
        }

        stringBuilder.append("]");

        return stringBuilder.toString();
    } 

}