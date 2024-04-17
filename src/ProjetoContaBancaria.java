import java.util.Scanner;

public class ProjetoContaBancaria {
    public static void main(String[] args) {
        String nome = "Louie Pereira";
        String tipoDeConta = "Corrente";
        double saldo = 2500.00;
        String cpf = "222.333.444-82";
        boolean realizandoOperacoes = true;

        System.out.println("**********************************************\n");
        System.out.println("Nome: \t\t\t\t " + nome);
        System.out.println("Tipo de conta: \t\t " + tipoDeConta);
        System.out.println("Saldo Inicial: \t\t R$ " + saldo + "\n");

        while (realizandoOperacoes) {
            System.out.println("**********************************************\n");
            System.out.println("""
                ** Digite o número da opção desejada **
               
                1 - Consultar saldo
                2 - Consultar informações da conta
                3 - Receber valor
                4 - Transferir valor
                5 - Sair
            
                Digite a opção desejada:
            """);

            Scanner leitura = new Scanner(System.in);
            int opcaoEscolhida = leitura.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    System.out.println("Seu saldo atual é: R$ " + saldo + "\n");
                    break;
                case 2:
                    System.out.println("\nNome: \t\t\t\t " + nome);
                    System.out.println("Tipo de conta: \t\t Corrente");
                    System.out.println("Seu CPF: \t\t\t " + cpf + "\n");
                    break;
                case 3:
                    System.out.println("Informe o valor a receber: ");
                    double valorAReceber = leitura.nextDouble();
                    saldo += valorAReceber;
                    System.out.println("Seu novo saldo é: R$ " + saldo + "\n");
                    break;
                case 4:
                    if (saldo > 0) {
                        System.out.println("Informe o valor a ser transferido: ");
                        double valorATransferir = leitura.nextDouble();
                        if (valorATransferir <= saldo && valorATransferir > 0) {
                            saldo -= valorATransferir;
                            System.out.println("\nVocê transferiu R$ " + valorATransferir);
                            System.out.println("Seu novo saldo é: R$ " + saldo + "\n");
                        } else if (valorATransferir == 0) {
                            System.out.println("\nNão é possível transferir o valor de R$ " + valorATransferir + "\n");
                        } else if (valorATransferir < 0) {
                            System.out.println("\nO valor inserido R$ " + valorATransferir + " seria para receber, não para transferir.\n");
                        } else {
                            System.out.println("\nVocê não possui o valor de R$ " + valorATransferir + " inserido.");
                            System.out.println("Tente novamente!\n");
                        }
                    } else {
                        System.out.println("\nSeu saldo está zerado. É impossível realizar uma transferência!\n");
                    }
                    break;
                case 5:
                    realizandoOperacoes = false;
                    break;
                default:
                    System.out.println("\nOpção inválida!\n");
                    break;
            }
        }

        System.out.println("\nSessão finalizada!");
    }
}
