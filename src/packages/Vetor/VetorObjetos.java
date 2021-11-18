package packages.Vetor;

public class VetorObjetos {
    private Object[] elementos;
    private int      tamanho;

    public VetorObjetos(int capacidade){
        this.elementos = new Object[capacidade];
        this.tamanho   = 0;
    }

    public boolean adiciona(Object elemento) {
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } 
        return false;
    }

    //Sobrecarga do método adicionar
    public boolean adiciona(int posicao, Object elemento){

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
            Object[] elementosNovos = new Object[this.elementos.length * 2];
            for(int i = 0; i < this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public Object busca(int posicao){
        
        if(!(posicao >=0 && posicao < this.tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(Object elemento){

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
