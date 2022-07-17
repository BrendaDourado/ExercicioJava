import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class eachTeste {
        public static void eachianosI() {
            Scanner sc = new Scanner(System.in);

            System.out.println("Insira o texto");
            String text = sc.nextLine();

            System.out.println("Insira a quantidade de palavras para a busca");
            int wordsQty = sc.nextInt();
            sc.nextLine();

            System.out.println("Insira as palavra para busca, separadas por espaço");
            String searchWords = sc.nextLine();
            sc.close();

            String[] wordsArr = searchWords.split(" ");

            String result = "";

            for (int i = 0; i < wordsArr.length; i++) {
                String find = wordsArr[i];
                Pattern pattern = Pattern.compile("\\b" + find + "\\b");
                Matcher matcher = pattern
                        .matcher(text);
                // Check all occurrences
                while (matcher.find()) {
                    result += matcher.start() + " ";
                    // System.out.print("Start index: " + matcher.start());
                    // System.out.print(" End index: " + matcher.end());
                    // System.out.println("\nFound: " + matcher.group());
                }
                result += "\n";
            }
            System.out.println(result);
        }
    }

