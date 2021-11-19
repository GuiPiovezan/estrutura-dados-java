package packages.Vetor;

import java.lang.reflect.Array;

public class VetorGeneric<T> {
    private T[] elementos;
    private int      tamanho;

    public VetorGeneric(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho   = 0;
    }

    public VetorGeneric(int capacidade, Class<T> tipoClasse){
        this.elementos = (T[])Array.newInstance(tipoClasse, capacidade);
        this.tamanho   = 0;
    }

    public boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } 
        return false;
    }

    //Sobrecarga do método adicionar
    public boolean adiciona(int posicao, T elemento){

        if(!(posicao >=0 && posicao < this.tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();
        
        //mover todos os elementos
        for(int i = this.tamanho - 1; i >= posicao; i--){
            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for(int i = 0; i < this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public T busca(int posicao){
        
        if(!(posicao >=0 && posicao < this.tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(T elemento){

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

    public void remove(int posicao){
        if(!(posicao >=0 && posicao < this.tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }

        for(int i = posicao; i < this.tamanho - 1; i++){
            this.elementos[i] = this.elementos[i + 1];
        }

        this.tamanho--;
    }

    //exercício 01 - implmentar método contém elemento que retorna um boolean
    public boolean contem(T elemento){

        for(int i = 0; i < tamanho; i++){
            if(this.elementos[i].equals(elemento)){
                return true;
            }
        }

        return false;
    }

    //exercício 02 - implementar método ultimoIndice semelhante a lastIndexOf() de ArrayList
    public int ultimoIndice(T elemento){
        for(int i = 0; i < tamanho; i++){
            if(this.elementos[i].equals(elemento)){
                return i;
            } 
        }   
    
        return -1;
    }

    //exercício 03 - implementar método remove passando como parâmetro o elemento a ser removido
    public void remove(T elemento) throws IllegalArgumentException{
        int posicao = -1;
        for(int i = 0; i < this.tamanho; i++){
            if(this.elementos[i].equals(elemento)){
                posicao = i;
            }
        }

        if(posicao > -1){
            for(int  i = posicao; i < this.tamanho - 1; i++){
                this.elementos[i] = this.elementos[i + 1];
            }

            this.tamanho --;
        } else {
            throw new IllegalArgumentException("Posição inválida");
        }
    }

    //exercício 04 - implementar um método obtem() que retornará o elemento dada uma posição
    public T obtem(int posicao){
        if(!(posicao >=0 && posicao < this.tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }

        return this.elementos[posicao];
    }

    @Override
    public String toString(){

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("[");

        for(int  i = 0; i < this.tamanho - 1; i++){
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
