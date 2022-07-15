import java.util.Scanner;

public class Fatorial {

    public static void fatorial(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o numero para saber o seu fatorial : ");
        final int N = sc.nextInt();
        int Nn = N;
        int fatorialDeN = N;

        while (Nn > 1 ){
            System.out.printf("FatorialDeN é %d - Adicionando %d vezes %d \n", fatorialDeN, N, (Nn -1));
            fatorialDeN *= (Nn-1) ;
            Nn--;
        }
        System.out.println(fatorialDeN);
    }
}
