public class Teste {

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        //lista.insereInicio(5);
        //lista.insereFim(10);
        //lista.insereInicio(20);
        //lista.imprime();
        lista.insere(3, 0);
        lista.insere(2, 0);
        lista.insere(1, 0);
        lista.insere(7, 0);
        lista.insere(4, 3);
        lista.insere(5, 5);
        lista.insere(6, 6);
         System.out.println("Valor removido: "+lista.removeInicio());
        lista.imprime();
       
    }
    
}
