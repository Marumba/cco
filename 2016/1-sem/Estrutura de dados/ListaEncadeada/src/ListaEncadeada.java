
public class ListaEncadeada {

    private Node inicio, fim;
    private int quant;

    public ListaEncadeada() {
        inicio = fim = null;
        quant = 0;
    }

    public void insereInicio(int novoElemento) {
        Node novo = new Node(novoElemento);
        if (inicio == null) {
            fim = novo;
        } else {
            novo.proximo = inicio;
        }
        inicio = novo;
        quant++;
    }

    public void insereFim(int novoElemento) {
        Node novo = new Node(novoElemento);
        if (inicio == null) {
            inicio = novo;
        } else {
            fim.proximo = novo;
        }
        fim = novo;
        quant++;
    }

    public void imprime() {
        Node aux = inicio;
        while (aux != null) {
            System.out.println(aux.valor);
            aux = aux.proximo;
        }
    }
    
    public void insere(int novoElemento, int indice) {
        if (indice < 0 || indice > quant) {
            System.out.println("Índice é inválido");
        } else {
            Node novo = new Node(novoElemento);
            if (indice == 0) {
                if (inicio == null) {
                    fim = novo;
                } else {
                    novo.proximo = inicio;
                }
                inicio = novo;
            } else {
                Node aux = inicio;
                for (int i = 0; i < indice - 1; i++) {
                    aux = aux.proximo;
                }
                novo.proximo = aux.proximo;
                aux.proximo = novo;
                if(novo.proximo == null) {
                    fim = novo;
                }
            }
            quant++;
        }
    }
    
    public int removeInicio() {
        if(inicio != null){
            Node aux = inicio; 
            inicio = inicio.proximo;
            aux.proximo = null;
            if (inicio == null){
                fim = null;
            }
            quant--;
            return aux.valor;
        }       
        return -1;      
    }
    
    public int removeFim() {
        if(inicio!=null){
            Node retorno = fim; 
            if (inicio.proximo == null){
                inicio = null;
                fim = null;
                quant--;
                return retorno.valor;
            }else{
                Node aux = inicio;
                while(aux.proximo != fim)
                {
                    aux = aux.proximo;
                }
                fim = aux;
                fim.proximo = null;
                quant--;
                return retorno.valor;
            }                     
        }       
        return -1;       
    }
    
    public int remove(int indice) {
      return 1;
    }
}
