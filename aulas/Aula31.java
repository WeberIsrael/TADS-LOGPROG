package aulas;

public class Aula31 {
    
}














String nome_arquivo = "arquivos/valores 10.txt";
int i;
int soma = 0, valor lido;
double media;

try{
    File arquivo = new File(nome _arquivo);
    Scanner entrada = new Scanner(arquivo);

    for(i=0; 1<10; i++){
        valor_lido = entrada.nextInt();
        soma = soma + valor_tudo;
    }

    media = soma / (double) 10;

    System.out.println("<Média: " + media);

    entrada.close();

}catch(Exception e){
    System.err.println("Error: ");
    System.err.println(e);


}

public static void ex02(){


}