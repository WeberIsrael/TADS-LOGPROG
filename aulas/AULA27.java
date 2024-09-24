package aulas;
import libs.Vetores;

public class AULA27{
    public static void aula(){
    System.out.println("Aula 27 - Vetores");
    exercicioLeituraVetorInteiros();
    }

    public static void exercicioLeituraVetorInteiros(){
        int n = 4;
        int[] valores;
    
        System.out.println("Digite os " + n + " valores:"); 
        valores = Vetores.lerInteiros(n);

        Vetores.mostrar(valores);


    }

}




    
