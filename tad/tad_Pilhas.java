package tad;
public class tad_Pilhas {

    public int max;
    public int topo = -1;
    public Object[] pilha;

    public tad_Pilhas(int max){
        this.max = max;
        pilha = new Object[max];
    }

    public Object topo(){
        Object k = vazia();
        if (topo != -1) k = pilha[topo];
        return k;
    }

    public int vazia(){
        int k;
        if (topo == -1) k = 1;
        else k = 0;
        return k;
    }

    public int cheia(){
        int k;
        if (topo == max) k = 1;
        else k = 0;
        return k;
    }

    public void empilha(Object elemento){
        if (cheia() != 1){
            topo++;
            pilha[topo] = elemento;
        } else cheia();
    }

    public Object desempilha(){
        Object k = vazia();
        if (vazia() != 1){
            topo--;
            k = pilha[topo+1];
        }
        return k;
    }
}
