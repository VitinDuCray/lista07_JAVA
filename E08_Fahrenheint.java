package lista07;

public class E08_Fahrenheint {

	public static void main(String[] args) {
		int celsius = 10;

        System.out.println("Conversão de Celsius para Fahrenheit:");
        System.out.println("Celsius\tFahrenheit");

        while (celsius <= 100) {
            double fahrenheit = (celsius * 9.0 / 5.0) + 32;
            System.out.printf("%d\t%.2f\n", celsius, fahrenheit);
            celsius += 10;
        }

	}

}
