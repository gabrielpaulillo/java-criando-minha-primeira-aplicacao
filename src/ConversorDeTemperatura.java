public class ConversorDeTemperatura {
    public static void main(String[] args) {
        double celsius = 37.8;
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println(String.format("A temperatura de %f celsius para fahrenheit é: %f", celsius, fahrenheit));
        int tempFahrenheit = (int)fahrenheit;
        System.out.println("A temperatura em fahrenheit inteira é: " + tempFahrenheit);
    }
}
