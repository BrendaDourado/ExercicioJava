import java.util.Scanner;

public class CircleArea {

    public static void circleArea(){
        Scanner sc = new Scanner(System.in);
        final double n = 3.14159;
        System.out.println("Insira o valor raio: ");
        float raio = sc.nextFloat();
        double area = n * Math.pow(raio,2);
        System.out.printf("A area do círculo é = %.4f ", area);
    }
}
