package lista07;

import java.util.Scanner;

public class E02_Soma100Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		int numero = 1;	
		
		while (numero <= 100) {
			soma += numero;
			numero++;
		}
		
		System.out.println("O total da soma obtida dos cem primeiros números inteiros é: " + soma + ".");
		
		sc.close();
	}

}
