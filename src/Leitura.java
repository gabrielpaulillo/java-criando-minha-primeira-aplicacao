import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Qual o seu filme favorito?");
        String nomeDoFilme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Qual a avaliação do filme?");
        double avaliacaoDoFilme = leitura.nextDouble();

        System.out.println("O filme inserido foi: " + nomeDoFilme);
        System.out.println("O ano de lançamento inserido foi: " + anoDeLancamento);
        System.out.println("A avaliação do filme inserida é: " + avaliacaoDoFilme);
    }
}
