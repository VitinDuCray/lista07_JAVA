package lista07_JAVA;

import java.util.Scanner;

public class E09_Aritmetica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero1 = sc.nextInt();
		int contadora = 1;
		int soma = 0;
		soma += numero1;
		
		while(contadora < 10) {
			System.out.println("Digite mais um número:");
			int numero2 = sc.nextInt();
			soma += numero2;
			contadora++;
		}
		
		int resultado = soma / 10;
		
		System.out.println("O resultado é: " + resultado);
		
		sc.close();
	}

}
