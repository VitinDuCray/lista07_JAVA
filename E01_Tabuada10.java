package lista07;

import java.util.Scanner;

public class E01_Tabuada10 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int contadora = 1;
		
		System.out.println("Insira um número para exibir sua tabuada do 1 ao 10:");
		int numero = sc.nextInt();
		
		while (contadora <= 10) {
			System.out.println(numero + " X " + contadora + " = " + (numero*contadora));
			contadora++;
		}
		
		sc.close();
	}
}
