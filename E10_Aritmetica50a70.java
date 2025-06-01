package lista07_JAVA;

import java.util.Scanner;

public class E10_Aritmetica50a70 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = 50;
		
		System.out.println(numero);
		while(numero < 71) {
			numero++;
			int resto = numero % 2;
			if (resto == 0) {
				System.out.println(numero);
			}
		} 
		
		sc.close();
	}

}
