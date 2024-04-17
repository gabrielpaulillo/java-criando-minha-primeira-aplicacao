import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Insira um número para descobrir seu cálculo fatorial: ");
        int numeroInserido = leitura.nextInt();
        int i = numeroInserido - 1;
        int total = numeroInserido;

        while (i > 0) {
            total *= i;
            i--;
        }
        System.out.println("O fatorial de " + numeroInserido + " é " + total);
    }
}
