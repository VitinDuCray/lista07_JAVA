package lista07_JAVA;

import java.util.Scanner;

public class E06_CalculadoraPotencia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base");
		int base = sc.nextInt();
		System.out.println("Digite o valor do expoente");
		int expoente = sc.nextInt();
		double resultado = Math.pow(base, expoente);
		
		System.out.println(base + "^" + expoente + "=" + resultado);
		
		sc.close();
	}

}
