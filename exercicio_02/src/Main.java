import java.util.Scanner;

//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um numero inteiro: ");
        int x = sc.nextInt();
        System.out.print("Informe um numero inteiro: ");
        int y = sc.nextInt();

        int soma = x + y;

        System.out.printf("SOMA = %d\n", soma);

        sc.close();


    }
}