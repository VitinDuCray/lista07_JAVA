package lista07_JAVA;

import java.util.Scanner;

public class E11_AreaResidencial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double areaTotal = 0.0;
		String resposta = "SIM";

		while (resposta.equalsIgnoreCase("SIM")) {
			System.out.println("Digite o nome do cômodo:");
			String nomeComodo = sc.nextLine();

			System.out.println("Digite a largura do(a) " + nomeComodo + " (em metros):");
			double largura = sc.nextDouble();

			System.out.println("Digite o comprimento do(a) " + nomeComodo + " (em metros):");
			double comprimento = sc.nextDouble();

			double areaComodo = largura * comprimento;
			areaTotal += areaComodo;

			System.out.println("Área do(a) " + nomeComodo + ": " + String.format("%.2f", areaComodo) + " m²");

			sc.nextLine();

			System.out.println("Deseja adicionar outro cômodo? (SIM/NAO)");
			resposta = sc.nextLine();
		}

		System.out.println("Área total da residência: " + String.format("%.2f", areaTotal) + " m²");

		sc.close();
	}
}
