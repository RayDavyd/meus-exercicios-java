package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Informe os valores de A, B e C do triangulo X: ");
        x.A = sc.nextDouble();
        x.B = sc.nextDouble();
        x.C = sc.nextDouble();
        System.out.println("Informe os valores de A, B e C do triangulo Y: ");
        y.A = sc.nextDouble();
        y.B = sc.nextDouble();
        y.C = sc.nextDouble();


        double areaX = x.area();

        double areaY = y.area();

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
