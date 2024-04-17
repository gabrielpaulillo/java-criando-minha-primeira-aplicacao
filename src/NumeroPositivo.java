import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Insira um número: ");

        int numeroUsuario = leitura.nextInt();

        if (numeroUsuario > 0) {
            System.out.println("O número " + numeroUsuario + " é positivo!");
        } else if (numeroUsuario < 0) {
            System.out.println("O número " + numeroUsuario + " é negativo!");
        } else {
            System.out.println("O número inserido é 0.");
        }
    }
}
