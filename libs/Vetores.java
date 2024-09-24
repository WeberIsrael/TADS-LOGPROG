package libs;

public class Vetores {
    public static int [] alocaElemntos(int n) {
        int [] vetor;
        int i;

        vetor = new int[n];

        for(i = 0; i < vetor.length; i++) {
            vetor[i] = 0;
        }
        return vetor;
    
}

public static void mostrar(int [] vetor) {
    int i;

    System.out.print("[  ");
    for(i = 0; i < vetor.length; i++) {

        System.out.print(vetor[i]);

        if(i < vetor.length - 1) {
            System.out.print(", ");
        }
    }
}
}
            