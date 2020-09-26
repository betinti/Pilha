import tad.tad_Pilhas;

public class main {

    public static void main(String[] args) {
        tad_Pilhas teste = new tad_Pilhas(100);

        System.out.println(teste.topo());
        System.out.println(teste.vazia());
        System.out.println(teste.cheia());

        teste.empilha(2);
        System.out.println(teste.topo());

        System.out.println(teste.desempilha());

        teste.empilha(5);
        teste.empilha(6);
        teste.empilha(20);
        System.out.println(teste.topo());
    }
}
