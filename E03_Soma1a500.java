package lista07_JAVA;

public class E03_Soma1a500 {

	public static void main(String[]args) {
		int contadora = 1;
		int soma = 0;
		
		while (contadora <= 500) {
			soma += contadora;
			contadora++;
		}
		System.out.println(soma);
	}
}
