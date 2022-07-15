import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DDD {
    public static void ddd(){
        Scanner sc = new Scanner(System.in);

        Map<Integer,String> mapDDD = new HashMap<>();
        mapDDD.put(61 , "Brasília");
        mapDDD.put(71 , "Salvador");
        mapDDD.put(11 , "São Paulo");
        mapDDD.put(21 , "Rio de Janeiro");
        mapDDD.put(32 , "Juiz de Fora");
        mapDDD.put(19 , "Campinas");
        mapDDD.put(27 , "Vitoria");
        mapDDD.put(31 , "Belo Horizonte");

        System.out.println("Insira o DDD: ");
        int entrada = sc.nextInt();
         if(mapDDD.containsKey(entrada)){
            System.out.println(mapDDD.get(entrada));
        }
         else{
             System.out.println("DDD não Cadastrado");
         }


    }
}
