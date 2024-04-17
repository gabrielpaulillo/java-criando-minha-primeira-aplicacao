import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Insira um número para descobrir se este é par ou ímpar: ");
        int numeroInserido = leitura.nextInt();

        if (numeroInserido % 2 != 0) {
            System.out.println("O número " + numeroInserido + " é ímpar");
        } else {
            System.out.println("O número " + numeroInserido + " é par");
        }
    }
}
