package exec1.pkg10;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;
public class Exec110 {

    public static void main(String[] args) throws IOException {    
            
       /* ex01();       
        ex02();
        ex03();
        ex04();
        ex05();
        ex06();
        ex07();
        ex08();
        ex09();*/
       ex10();
    
    }
    
    public static void ex01(){
        
        int a[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
        int b[][] = {{2,3,4},{5,6,7},{8,9,10},{11,12,13},{14,15,16}};     
        int c[][]  = new int[5][3];
        Resultado resp = new Resultado(1);
        
        for(int i=0; i < a.length; i++)
        {
            for(int j=0; j < a[1].length; j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        resp.msg("Matriz 1");
        resp.calculaInt(a);
        resp.msg("Matriz 2");
        resp.calculaInt(b);
        resp.msg("Matriz Resultado");
        resp.calculaInt(c);
    }
    
    public static void ex02(){
        
        int x[] = {1,2,3,4,5,6,7,8,9,10};
        int y[] = {11,12,13,14,15,16,17,18,19,20};
        double z[][] = new double[4][10];
        Resultado resp = new Resultado(2);
                
        for(int i=0; i < z.length; i++)
        {
            for(int j=0; j < z[i].length; j++)
            {
                if (i==0){
                    z[0][j] = x[j] ;
                } else if(i==1){
                    z[1][j] = y[j] ;
                } else if(i==2){
                    z[2][j] = y[j] + x[j] ;
                } else {
                    z[3][j] = y[j] * x[j] ;
                }
            }
        }
        
        resp.calculaDouble(z);
    }
    
    public static void ex03(){
        double a[][] = {{1,2,3,4,5,6},{2,3,4,5,6,7},{3,4,5,6,7,8},{4,5,6,7,8,9}};
        double b[][] = new double[7][4];
        Resultado resp = new Resultado(3);
        
        for (int i=0; i < b.length; i++)
        {
            for (int j=0; j < b[i].length; j++)
            {
                if(i<6){
                    b[i][j] = a[j][i];
                    b[6][j] += a[j][i];
                } else {
                    b[6][j] /= 6;
                }               
            }
        }      
        resp.calculaDouble(b);
    }
    
    public static void ex04(){
        int a[][] = {{1,2,3},{4,5,6}};
        int b[][] = new int[3][2];
        Resultado resp = new Resultado(4);
        
        for (int i = 0; i < b.length; i++)
        {
            for (int j = 0; j< b[i].length; j++)
            {
                b[i][j] = a[j][i];
            }
        }
        resp.msg("Matriz Original");
        resp.calculaInt(a);
        resp.msg("Matriz Transposta");
        resp.calculaInt(b);
    }
    
    public static void ex05(){
        ResultadoString result = new ResultadoString(5);

        System.out.println("A) Sua frase possui "+result.contaChar()+" caracteres");
        System.out.println("B) O quarto caracter da string é "+result.resgataChar(3));
        System.out.println("C) Entre uma nova frase, "+result.novaFrase(2));
        System.out.println("D) Ela possui x"+result.qntdChar('a',result.getFraseDois())+" caracteres 'a'");
    }
    
    public static void ex06(){
        ResultadoString result = new ResultadoString(6);
        String maiusculo = "";
        String invertido = "";
        result.novaFrase(0);
        System.out.println("A) e B) As duas "+result.comparaString());
        
        if (result.qntdChar('o',result.getFraseDois()) > result.qntdChar('o',result.getFrase())){
            System.out.println("C) A 1ª frase possui menos ocorrências do caracter 'o'");
        }else if(result.qntdChar('o',result.getFraseDois()) == result.qntdChar('o',result.getFrase())){
            System.out.println("C) O número de ocorrências é igual");
        }else{
            System.out.println("C) A 2ª frase possui menos ocorrências do caracter 'o'");
        }
        
        System.out.println("D) Todas as vogais da 1ª frase para maisuculo");
        maiusculo = result.getFrase().replace("a","A").replace("e","E").replace("i","I").replace("o","O").replace("u","U");
        System.out.println(" - "+maiusculo);
        
        for (int i=result.getFraseDois().length() -1; i >= 0;i--)
        {
            invertido += result.getFraseDois().charAt(i);
        }
        
        System.out.println("E) Posição da 2ª frase invertida");
        System.out.println(" - "+invertido);
        
        if (result.getFrase().startsWith("da") || result.getFraseDois().startsWith("da") || result.getFrase().endsWith("da") || result.getFraseDois().endsWith("da")){
            System.out.println("F) Alguma frase inicia ou termina com 'da' ");
        }else{
            System.out.println("F) Nenhuma frase inicia ou termina com 'da'");
        }
        
    }
    
    public static void ex07(){
        String a = "ana";
        String b = "frase número 2";
        String e = "Teste";
        ResultadoString result = new ResultadoString(7, a, b);
        
        System.out.println("A) As duas strings são palíndromos ? "+result.checaPalindromo());
        System.out.println(" - String A: "+result.bFrase.reverse());
        System.out.println(" - String B: "+result.bFraseDois.reverse());
        result.bFrase = result.bFrase.append(result.bFraseDois);
        System.out.println("B) 1ª String concatenada com a 2ª: "+result.bFrase);
        System.out.println("C) Inversão da 1ª string: "+result.inverte(result.bFrase));
        System.out.println("D) Inversão da 2ª string: "+result.inverte(result.bFraseDois));
        System.out.println("D) 'Teste' na 3ª posição da 2ª string: "+result.bFraseDois.insert(2, "Teste"));
    }
    
    public static void ex08(){
        ResultadoString result = new ResultadoString(8,1);
        
        System.out.println("A palavra é repedita "+result.contaRepeticao()+"x");
    }
    
    public static void ex09(){
        
        try (
            FileInputStream fin = new FileInputStream("arquivo1.txt");
            FileOutputStream fout = new FileOutputStream("arquivo2.txt")
        ){
            if (fin != null && fout != null) {
                int c = fin.read();
                fout.write(c);
            }
        } catch (IOException exc) {
            System.out.println("IOException: programa falhou.\n" + exc);
        }
    }
    
    public static void ex10() throws IOException{
        
        int a[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
        int b[][] = {{2,3,4},{5,6,7},{8,9,10},{11,12,13},{14,15,16}};
        int c[][] = {{3,4,5},{6,7,8},{9,10,11},{12,13,14},{15,16,17}};
        String arquivo = "matriz2.txt";
        Resultado result = new Resultado(10);
        
        result.limpaTxt(arquivo);
        result.vectorToString(arquivo, a);
        result.vectorToString(arquivo, b);
        result.vectorToString(arquivo, c);
        
    }
}

class Resultado 
{    
    private String str;

    public Resultado(int num)
    {
        System.out.println("------- Execercício "+num+" --------\n");
    }

    public void calculaDouble(double[][] matriz)
    {
        str = "";
        for(int i=0; i < matriz.length; i++)
        {
            for(int j=0; j< matriz[i].length ; j++)
            {
                str += " " + matriz[i][j];
            }        
            str += "\n";
        }
        System.out.println(str);
    }

    public void calculaInt(int[][] matriz)
    {
        str = "";
        for(int i=0; i < matriz.length; i++)
        {
            for(int j=0; j< matriz[i].length ; j++)
            {
                str += " " + matriz[i][j];
            }        
            str += "\n";
        }
        System.out.println(str);
    }
        
    public void msg(String msg){
        System.out.println(msg+"\n");
    }
    
    public void vectorToString(String nomeFile, int[][] a){

        try (
             BufferedWriter bw = new BufferedWriter(new FileWriter(nomeFile, true))
        ){
            bw.write("[");
            for (int i=0;i<a.length;i++)
            {
                bw.write("[");
                for (int j=0;j<a[i].length;j++)
                {
                    bw.write(a[i][j]+" ");
                }
                bw.write("]");
                if(i+1<a.length){
                    bw.write(",");
                }
            }
            bw.write("]");
            bw.newLine();            
        } catch (IOException ex) {
            System.out.println("Erro: "+ex);
        }
    }
    
    public void limpaTxt(String nomeFile){

        System.out.println("Checando existencia do arquivo "+nomeFile);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeFile, false))){
            System.out.println("Arquivo "+nomeFile+" encontrado");          
            bw.write("");   
        } catch (IOException ex) {        
            System.out.println("Erro: "+ex);
        }
    }
}

class ResultadoString extends Resultado
{
    private String frase;
    private String fraseDois;
    public StringBuffer bFrase;
    public StringBuffer bFraseDois;
    Scanner entrada = new Scanner(System.in);

    public ResultadoString(int num) {
        super(num);
        
        System.out.println("Escreva uma frase de no mínimo 20 caracteres:");
        frase = entrada.nextLine();
    }
    
    public ResultadoString(int num, String a, String b){
        super(num);
        
        bFrase = new StringBuffer(a); 
        bFraseDois = new StringBuffer(b); 
    }
    
    public ResultadoString(int num, int a){
        super(num);
        
        System.out.println("Escreva uma frase:");
        frase = entrada.nextLine(); 
        
        System.out.println("Escreva uma palavra:");
        fraseDois = entrada.nextLine(); 
    }
    
    public String getFraseDois(){
        return this.fraseDois;
    }
    
    public String getFrase(){
        return this.frase;
    }
    
    public int contaChar(){
        return frase.length();
    }
    
    public char resgataChar(int pos){
        return frase.charAt(pos);
    }
    
    public String novaFrase(int pos){
        System.out.println("Escreva uma segunda frase de no mínimo 10 caracteres:");
        fraseDois = entrada.nextLine();
        return fraseDois = fraseDois.substring(pos);
    }
    
    public int qntdChar(char a, String frase){
        int acm = 0;
        for (int i =0; i < frase.length(); i++ )
        {
            if (frase.charAt(i) == a){
                acm++;
            }        
        }
        return acm;
    }
    
    public String comparaString(){
       if (frase.equals(fraseDois)){
           return "são iguais";
       }
       if (frase.compareTo(fraseDois) > 0){
           return "são diferentes e a 1ª frase é maior que a 2ª";
       }else if (frase.compareTo(fraseDois) == 0){
           return "são diferentes e a 1ª frase tem o mesmo tamanho que a 2ª";
       }else{
           return "são diferentes e a 2ª frase é maior";
       }
    }
    
    public StringBuffer inverte(StringBuffer a){
        return a.reverse();
    }
    
    public boolean checaPalindromo(){
        if (bFrase.equals(bFrase.reverse()) && bFraseDois.equals(bFraseDois.reverse())){
            return true;
        }
        
        return false;
    }
    
    public int contaRepeticao(){
        StringTokenizer a = new StringTokenizer(frase, " ");
        int acm = 0;
           
        while(a.hasMoreTokens())
        {
            if (a.nextToken().equals(fraseDois)){
                acm++;
            }
        }
        
        return acm;
    }
   
}