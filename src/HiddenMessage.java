import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HiddenMessage {

    public static void hiddenMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas frases você quer decifrar ? ");
        int N = sc.nextInt();
        sc.nextLine();


        for(int i=0; i<N; i++){

            System.out.println("\n Insira a frase ocultada: ");
            String phrase = sc.nextLine();
            if(phrase.trim().equals("")){
                System.out.println(phrase);
            }
            else {
                String[] arrPhrase = phrase.trim().split("\\s+");
                List<String> sentence = new ArrayList<String>();

                for (String word : arrPhrase) {
                    String letter = word.substring(0, 1).toLowerCase();
                    sentence.add(letter);
                }
                sentence.forEach(System.out::print);
            }
        }

    }
}
