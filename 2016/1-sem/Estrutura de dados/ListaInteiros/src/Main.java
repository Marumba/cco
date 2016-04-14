
public class Main {

    public static void main(String[] args) {

        ListaInteiros lista = new ListaInteiros();
        //System.out.println("insira um elemento");
        lista.insere(6);
        lista.insere(5);
        lista.insere(8); 
        lista.remove(8);
       // lista.insere(15);
        //System.out.println("Removeu o elemento: "+lista.remove(8));
        lista.imprime();

    }
    
}
