import java.util.Scanner;

public class ComparandoDoisNumeros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Jogador 1, insira o seu número: ");
        int jogadorUm = leitura.nextInt();
        System.out.println("Jogador 2, insira o seu número: ");
        int jogadorDois = leitura.nextInt();

        if (jogadorUm > jogadorDois) {
            System.out.println("O número " + jogadorUm + " escolhido pelo Jogador 1 é MAIOR que " + jogadorDois + " escolhido pelo Jogador 2.");
        } else if (jogadorUm < jogadorDois) {
            System.out.println("O número " + jogadorDois + " escolhido pelo Jogador 2 é MAIOR que " + jogadorUm + " escolhido pelo Jogador 1");
        } else {
            System.out.println("O número " + jogadorUm + " escolhido pelo Jogador 1 é IGUAL ao número escolhido pelo Jogador 2.");
        }
    }
}
