// Rodrigo Leopoldo 20667536
// Charles Brandão 20556325

class ListaInteiros {
    int fim = -1;
    int comeco =-1;
    int lista[]; 
    public ListaInteiros(){
        lista = new int[10];
    }
     public boolean verificaNumero(int numero){
        for(int i=0;i<fim+1; i++){
            if(numero == lista[i]){
                return true;
            }
        }
        return false;
     }
     public void insere(int numero){
         int pos=-1;
         if (isEmpty()){
             fim ++;
             comeco ++; 
             lista[0] = numero;
         }else if (!isFull()){
            fim ++;
            for(int i=0; i<fim;i++){ //descobrir ordem
                //System.out.println(lista[i]);
                if(numero>=lista[i]){
                    pos = i;
                    //System.out.println(pos);
                }
            }
            //System.out.println(pos);
            for(int i = fim;i > pos;i--){ // ordena os elementos
               lista[i+1]=lista[i];
               //System.out.println(lista[i]);
            }
            lista[pos+1] = numero;
        }
               
     }
     public int remove(int numero){
         
       // System.out.println(isEmpty());
        if (!isEmpty()){
            for(int i=0;i<fim+1;i++){
                if(numero == lista[i]){
                   // System.out.println(i);
                    //System.out.println(fim);
                    if (i!=fim){
                        for (int j=i;j<fim+1;j++){//esse
                            lista[j] = lista[j+1];
                        }
                    }
                    fim --;
                    return numero;
                }
            }
            return -1;
        }
         
        return -1;
     }
     public void imprime(){
         for(int i=0;i<fim+1;i++){
             System.out.print(lista[i]+", ");
         }
     }
     public int size(){
         return fim+1;
     }
     public boolean isFull(){
         return fim == lista.length;
     }
     public boolean isEmpty(){
         return comeco ==-1;
     }

}

