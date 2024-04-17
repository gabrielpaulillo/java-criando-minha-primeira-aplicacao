import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100); // gera um número aleatório entre 0 e 100
//        System.out.println("O número gerado foi: " + numeroAleatorio);
        int tentativas = 1;
        int tentativasMax = 7;

        for (int i = 0; i < tentativasMax; i++) {
            System.out.println("Tente acertar qual é o número gerado: ");
            int chute = leitura.nextInt();
            if (chute > numeroAleatorio) {
                System.out.println("O seu chute é MAIOR que o número gerado. Tente novamente!");
                System.out.println("Você tem mais " + (tentativasMax - tentativas) + " tentativas restantes!");
                tentativas++;
            } else if (chute < numeroAleatorio) {
                System.out.println("O seu chute é MENOR que o número gerado. Tente novamente!");
                System.out.println("Você tem mais " + (tentativasMax - tentativas) + " tentativas restantes!");
                tentativas++;
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas!");
                break;
            }
        }

        if (tentativas > tentativasMax) {
            System.out.println("Que pena! Infelizmente você não acertou o número gerado!");
            System.out.println("O número gerado era o " + numeroAleatorio);
        }

    }
}
