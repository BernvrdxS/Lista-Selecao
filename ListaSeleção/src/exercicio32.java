import java.util.Scanner;

public class exercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Para escolher entre 1(file), 2(alcatra) e 3(picanha) escolha: ");
		int escolha = entrada.nextInt();
		System.out.print("Pagamento no cartão Tabajara? s(sim) ou n(não)? ");
		char cartao = entrada.next().charAt(0);
		System.out.print("Quantos kg da carne selecionada você quer? ");
		double kg = entrada.nextDouble();

		double precoTotal = 0;

		if ((kg <= 5) && (escolha == 1)) {
			precoTotal = (kg * 4.90);
			System.out.println("Valor final: " + precoTotal);
		}

		else if ((kg > 5) && (escolha == 1)) {
			precoTotal = (kg * 5.80);
			System.out.println("Valor final: " + precoTotal);

		}
		if ((kg <= 5) && (escolha == 2)) {
			precoTotal = (kg * 5.90);
			System.out.println("Valor final: " + precoTotal);
		}

		else if ((kg > 5) && (escolha == 2)) {
			precoTotal = (kg * 6.80);
			System.out.println("Valor final: " + precoTotal);
		}

		if ((kg <= 5) && (escolha == 3)) {
			precoTotal = (kg * 6.90);
			System.out.println("Valor final: " + precoTotal);
		}

		else if ((kg > 5) && (escolha == 3)) {
			precoTotal = (kg * 7.80);
			System.out.println("Valor final: " + precoTotal);
		}
		if (cartao == 's') {
			precoTotal = precoTotal - (precoTotal * 0.05);
			System.out.println("O valor final com desconto é: " + precoTotal);

			entrada.close();

		}

	}

}
