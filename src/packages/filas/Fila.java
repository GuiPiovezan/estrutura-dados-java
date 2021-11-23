package packages.filas;

import packages.base.EstruturaEstatica;

//FIFO - First in First out
public class Fila<T> extends  EstruturaEstatica<T>{
    public Fila(){
        super();
    }

    public Fila(int capacidade){
        super(capacidade);
    }

    public void enfileirar(T elemento){
        super.adiciona(elemento);
    }

    public T espiarInicio(){
        if(this.estaVazia()){
            return null;
        }

        return this.elementos[0];
    }

    public T desinfileirar(){

        final int FIRST_POSITION = 0;

        if(this.estaVazia()){
            return null;
        }

        var elementoRemovido = this.elementos[FIRST_POSITION];
        this.remove(FIRST_POSITION);
        return elementoRemovido;
    }
}
