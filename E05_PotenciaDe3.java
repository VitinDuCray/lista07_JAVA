package lista07_JAVA;

public class E05_PotenciaDe3 {

	public static void main(String[] args) {
		int expoente = 0;

		while (expoente <= 15) {
			double resultado = Math.pow(3, expoente);
			System.out.println("3^" + expoente + " = " + (long)resultado);
			expoente++;
		}
	}
}
