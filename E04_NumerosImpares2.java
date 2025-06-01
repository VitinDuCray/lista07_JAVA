package lista07_JAVA;

public class E04_NumerosImpares2 {

	public static void main(String[] args) {
		int contadora = 0;
		
		while (contadora <= 20) {
			int resto = contadora % 2;
			if (resto > 0) {
				System.out.println(contadora);
				
			}
			contadora++;
		}
	}
}
