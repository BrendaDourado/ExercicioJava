import java.util.Scanner;

public class Population {

    public static void population(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas casos vamos testar ? ");
        int T = sc.nextInt();


        for(int i=0; i<T; i++){
            System.out.println("Qual a população da cidade A ? ");
            int pA = sc.nextInt();
            System.out.println("Qual a Taxa de Crescimento cidade A? ");
            float gA = sc.nextFloat();
            System.out.println("Qual a população da cidade B ? ");
            int pB = sc.nextInt();
            System.out.println("Qual a Taxa de Crescimento cidade B? ");
            float gB = sc.nextFloat();

            int years = 0;

            while(pA <= pB){
            years++;
            if(years > 100){
                System.out.println("Mais de 1 Século.");
                break;
            }

            pA += ((pA * gA) / 100);
            pB += ((pB * gB) / 100);
            }

            if(years <=   100) System.out.println( years + " anos");
        }
    }
}
