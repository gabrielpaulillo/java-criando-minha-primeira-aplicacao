import java.util.Scanner;

public class OutroLoop {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
//      variável 'totalDeNotas' funciona como o contador de notas, para que o loop não seja infinito
                totalDeNotas++;
            }
        }

        System.out.println("A média total é de: " + mediaAvaliacao/totalDeNotas);
    }
}