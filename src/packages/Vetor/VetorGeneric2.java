package packages.vetor;

import java.lang.reflect.Array;

import packages.base.EstruturaEstatica;

public class VetorGeneric2<T>  extends EstruturaEstatica<T>{
    

    public VetorGeneric2(){
        super();
    }

    public VetorGeneric2(int capacidade){
        super(capacidade);
    }

    public boolean adiciona(T elemento) {
        return super.adiciona(elemento);
    }

    public boolean adiciona(int posicao, T elemento){
        return super.adiciona(posicao, elemento);
    }

    public void remove(int posicao){
        super.remove(posicao);
    }

}
