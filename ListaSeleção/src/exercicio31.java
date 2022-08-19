import java.util.Scanner;

public class exercicio31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Para escolher entre 1(morango) e 2(maçã) escolha: ");
		int escolha = entrada.nextInt();

		System.out.print("Quantos kg da fruta selecionada você quer? ");
		double kg = entrada.nextDouble();

		double precoTotal = 0;

		if ((kg <= 5) && (escolha == 1)) {
			precoTotal = (kg * 2.50);
			System.out.println("Valor final: " + precoTotal);
		}

		else if ((kg > 5) && (escolha == 1)) {
			precoTotal = (kg * 2.20);
			System.out.println("Valor final: " + precoTotal);

		}
		if ((kg <= 5) && (escolha == 2)) {
			precoTotal = (kg * 1.80);
			System.out.println("Valor final: " + precoTotal);
		}

		else if ((kg > 5) && (escolha == 1)) {
			precoTotal = (kg * 1.50);
			System.out.println("Valor final: " + precoTotal);
		}
		if (kg > 8 || precoTotal > 25) {
			precoTotal = precoTotal - (precoTotal * 0.10);
			System.out.println("O valor final com desconto é: " + precoTotal);
		}
		entrada.close();
	}
}