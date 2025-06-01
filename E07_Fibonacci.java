package lista07_JAVA;

public class E07_Fibonacci {

	public static void main(String[] args) {
		int primeiroNumero = 1, segundoNumero = 1;
        int contador = 0;
		
		while (contador < 15) {
            System.out.print(primeiroNumero + " ");
            int proximoNumero = primeiroNumero + segundoNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = proximoNumero;
            contador++;
        }
	}
}
