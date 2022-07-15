import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Tautograma {

    public static void tautograma(){
        Scanner sc = new Scanner(System.in);
        List<String> compare = new ArrayList<String>();
        String entrada = "";

        while( !entrada.equals("*")){
            System.out.println("Insira a frase : ");
            entrada = sc.nextLine();
            String[] arrPieces = entrada.split(" ");
            for ( String word : arrPieces
                 ) {
                String letter = word.substring(0,1).toLowerCase();
                compare.add(letter);
            }
            if ( compare.stream().distinct().count()<=1 ){
                System.out.println("Y");
            }
            else {
                System.out.println("N");
            }
            //char[] arrFirstLetter =

        }


    }

}
