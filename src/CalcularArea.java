import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Escolha uma das opções abaixo: ");
        System.out.println("1. Calcular área do quadrado ou");
        System.out.println("2. Calcular área do círculo");
        int escolhaUsuario = leitura.nextInt();
        switch (escolhaUsuario) {
            case 1:
                System.out.println("Você escolheu a opção 1 - calcular a área do quadrado!");
                System.out.println("Insira a medida do lado do quadrado em centímetros: ");
                double ladoQuadrado = leitura.nextDouble();
                System.out.println("A medida da área do quadrado é: " + ladoQuadrado*ladoQuadrado + "cm².");
                break;
            case 2:
                System.out.println("Você escolheu a opção 2 - calcular a área do círculo!");
                System.out.println("Insira a medida do raio do círculo em centímetros: ");
                double raioCirculo = leitura.nextDouble();
                System.out.println("A medida da área do círculo é: " + (3.14 * (raioCirculo*raioCirculo)) + ".");
                break;
            default:
                System.out.println("Você inseriu um número diferente de '1' ou '2', tente novamente!");
                break;
        }
    }
}
