public class ConversaoTemperatura {
    public static void main(String[] args) {
        double temperaturaCelsius = 31;
        double temperaturaFahrenheit;

        temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        System.out.println(String.format("A temperatura em Fahrenheit é de %f graus", temperaturaFahrenheit));

        int temperaturaFahrenheitConvertida = (int) (temperaturaFahrenheit);

        System.out.println(String.format("A temperatura em Fahrenheit é de %d graus", temperaturaFahrenheitConvertida));
    }
}
