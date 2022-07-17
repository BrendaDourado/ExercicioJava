import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class EachianosI {

    public static void each() {
        Scanner sc = new Scanner(System.in);

        System.out.println("insira o texto");
        String text = sc.nextLine();
        System.out.println("insira  a qtdd de palavras a serem lidas : ");
        int wordsQty = sc.nextInt();
        sc.nextLine();
        System.out.println("Insira as palavras ");
        String phrase = sc.nextLine();
        String result = "";

        String[] pieces = phrase.split(" ");

        String palavra = "";
        int posicaoInicioBusca = -2;

        Map<Integer , String > mapText = new LinkedHashMap<>();

        for (Character caracter : text.toCharArray()) {
            if (Character.isAlphabetic(caracter)) { // verificação para armazenar somente letras
                palavra += caracter;
            } else {
                if (!palavra.isEmpty() /*&& !mapText.containsKey(palavra.toLowerCase())*/) { // verificação para não pegar a palavra novamente caso já tenha encontrado antes
                    int posicaoDeInicio = text.indexOf(palavra, posicaoInicioBusca ); // aqui pegamos a posição da palavra a partir da posicao da ultima palavra
                    mapText.put(posicaoDeInicio, palavra.toLowerCase());

                    posicaoInicioBusca = posicaoDeInicio -1 ;


                }

                palavra = "";
            }
        }

        //System.out.println(mapText);


        for (int i = 0; i < pieces.length; i++) {
            // ( String word : pieces) {

            for (int index = text.indexOf(pieces[i]);
                 index >= 0;
                 index = text.indexOf(pieces[i], index + 1)
            ) {
                result += (index + " ");
            }
            result += "\n";



        }
        System.out.println(result);
    }
}


