package packages.pilhas;

import packages.base.EstruturaEstatica;


//LIFO - Last in First out
public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha(){
        super();
    }

    public Pilha(int capacidade){
        super(capacidade);
    }

    //Last in
    public void empilha(T elemento){
        super.adiciona(elemento);
    }

    public T topo(){

        if(this.estaVazia()){
            return null;
        }

        return this.elementos[tamanho - 1];
    }

    //Firt in
    public T desempilhar(){
        if(estaVazia()){
            return null;
        }

        //Uma forma de desempilhar
        // T elemento = this.elementos[tamanho - 1];
        // this.elementos[tamanho - 1] = null;
        // this.tamanho--;

        //outra forma, porém simplificada
        return this.elementos[--tamanho];
    }
    
}
