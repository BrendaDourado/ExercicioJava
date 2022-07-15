import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenOrODD {

    public static void evenOrOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros serão inseridos? ");
        int N = sc.nextInt();
        System.out.println("Insira os um numeros:");

        List<Integer> ArrEntradas = new ArrayList<Integer>();
        String definition ="" ;
        String value = "";

        for(int i=0; i<N; i++){
            ArrEntradas.add(sc.nextInt());
        }
        for (Integer number : ArrEntradas){
           if(number == 0 ){
                System.out.println("NULL");
            }
             if (number % 2 == 0) {
                definition = "EVEN";
            }
            else {
                definition = "ODD";
            }
            if (number > 0) {
                value = "POSITIVE";
            }
            else if (number < 0) {
                value = "NEGATIVE";
            }

            if (number !=0){ System.out.println( definition + "  " + value); }
        }

    }
}
