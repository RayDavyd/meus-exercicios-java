//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.
//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159


import java.util.Scanner;


public class Main {
    static final double VALOR_PI = 3.14159;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do raio de um circulo: ");
        double raio = sc.nextDouble();

        double area = VALOR_PI * Math.pow(raio, 2);

        System.out.printf("O valor da area do circulo é: %.4f\n", area);

        sc.close();


    }
}
