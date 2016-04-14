package matriz;
public class Matriz {
    public static void main(String[] args) {
        // TODO code application logic here
        int matriz[][] = {  {1, 2,  3},
                            {4, 5,  6},
                            {7, 8,  9},
                            {10,11, 12}};
        
        ex1(matriz);
        System.out.println("");

        ex2(matriz);
        System.out.println("");
        
        ex3(matriz);
        System.out.println("");

        ex3inv(matriz);
        System.out.println("");

        exLar2();
       
        exLar1();
   }    

    private static void ex1(int[][] matriz) {
        System.out.println("exercício 1:");
        
        int soma = 0;
        
        for(int i=0; i < matriz.length; i++){
            for(int j=0; j< matriz[i].length ; j++){
                soma = soma + matriz[i][j];        
            }
        }

        System.out.println(soma);        
    }

    private static void ex2(int[][] matriz) {
        System.out.println("exercício 2:");
        
        int soma = 0;
        
        for(int i=0; i < matriz.length; i++){
            soma = 0;
            for(int j=0; j< matriz[i].length ; j++){
                soma = soma + matriz[i][j];
            }
            System.out.println(soma);
        }
    }
    
    private static void ex3(int[][] matriz) {
        System.out.println("exercício 3:");
        
        int soma = 0;
        
        for(int i=0; i < matriz[1].length; i++){
            soma = soma+matriz[i][i];
        }
        
        System.out.println(soma);
    }
    
    private static void ex3inv(int[][] matriz) {
        System.out.println("exercício 3 Diagonal 2:");
        
        int soma = 0;
        int col = matriz[1].length - 1;
        
        for(int i=0; i < matriz[1].length; i++){
            soma = soma + matriz[i][col];
            
            col--;
        }
        
        System.out.println(soma);
    }
    
    private static void exLar1() {
        System.out.println("exercício lar:");
        int matrizA[][] = { {1,2,3},
                            {4,5,6},
                            {7,8,9}};
        
        int matrizB[][] = { {1,2,3},
                            {4,5,6},
                            {7,8,9}};
        
        int result[][]  = new int[3][3];
        int col = 0, aux = 0;
        
        for(int i=0; i < matrizA.length; i++){
            for(int j=0; j < matrizA[1].length; j++){
                aux = aux + (matrizA[i][j] * matrizB[j][i]);
            }
            
            result[i][col] = aux;
            col++;
        }
        
        printarMatriz(result);
    }
    
    private static void exLar2() {
        System.out.println("exercício lar:");
        int matrizA[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int matrizB[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int result[][]  = new int[4][3];
        
        for(int i=0; i < matrizA.length; i++){
            for(int j=0; j < matrizA[1].length; j++){
                result[i][j] = matrizA[i][j]*matrizB[i][j];
            }
        }
        
        printarMatriz(result);
    }
        
    private static void printarMatriz(int[][] result) {
        String printar = "";
        
        for(int i=0; i < result.length; i++){
            for(int j=0; j< result[i].length ; j++){
                printar = printar + " " + result[i][j];
            }
            
            printar = printar + "\n";
        }
        
        System.out.println(printar);
    }
    
}