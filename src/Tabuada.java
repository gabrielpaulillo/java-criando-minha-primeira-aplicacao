import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Insira o número o qual você deseja descobrir sua tabuada: ");
        int numeroCalculado = leitura.nextInt();
        System.out.println("A tabuada do " + numeroCalculado + " é:");

        for (int i = 0; i < 11; i++) {
            System.out.println(numeroCalculado + " * " + i + " = " + (numeroCalculado * i));
        }
    }
}
