import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double aX, bX, cX, aY, bY, cY;

        System.out.println("Informe os valores de A, B e C do triangulo X: ");
        aX = sc.nextDouble();
        bX = sc.nextDouble();
        cX = sc.nextDouble();
        System.out.println("Informe os valores de A, B e C do triangulo Y: ");
        aY = sc.nextDouble();
        bY = sc.nextDouble();
        cY = sc.nextDouble();

        double p = (aX + bX + cX) / 2;
        double areaX = Math.sqrt(p * (p - aX) * (p - bX) * (p - cX));
        p = (aY + bY + cY) / 2;
        double areaY = Math.sqrt(p * (p - aY) * (p - bY) * (p - cY));

        System.out.printf("Area do Triangulo X = %.4f\n", areaX);
        System.out.printf("Area do Triangulo y = %.4f\n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior area: X");

        } else {
            System.out.println("Maior area: Y");

        }


        sc.close();
    }
}
