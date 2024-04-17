public class CalculaMediaDouble {
    public static void main(String[] args) {
        double primeiraNota = 7.3;
        double segundaNota = 5.2;
        double media = (primeiraNota + segundaNota) / 2;
        System.out.println("A média das duas notas é: " + media);

        int primeiraNotaInteira = (int)primeiraNota;
        System.out.println("A primeira nota convertida para inteiro é: " + primeiraNotaInteira);

        char letra = 'A';
        String palavra = "abelha ";
        System.out.println(letra + " " + palavra + "é amarela e preta.");

        double precoProduto = 5.99;
        int quantidade = 9;
        System.out.println((quantidade * precoProduto) + " é o valor total dos itens desejados.");


        double valorEmDolares = 7.99;
        double valorConvertido = valorEmDolares * 4.94;
        System.out.println(valorConvertido + " em reais");

        double precoOriginal = 22.30;
        double percentualDesconto = 10;
        double precoComDesconto = (precoOriginal * percentualDesconto) / 100;
        System.out.println("Preço original é: " + precoOriginal);
        System.out.println("Percentual de desconto é: " + percentualDesconto);
        System.out.println("O preço com o desconto aplicado é: " + precoComDesconto);
    }
}
