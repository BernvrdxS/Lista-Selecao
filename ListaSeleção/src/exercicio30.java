import java.util.Scanner;

public class exercicio30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escolha um tipo de combustível: ");
		System.out.print("A(alcool)");
		System.out.print("B(gasolina");
		char escolha = entrada.next().charAt(0);

		double valorFinal = 0;

		System.out.print("Informe o valor de litros: ");
		double litros = entrada.nextDouble();

		if ((litros <= 20) && (escolha == 'a')) {
			valorFinal = (litros * 1.90);
			System.out.println("Valor final sem descontos: " + valorFinal);
			valorFinal = valorFinal - (valorFinal * 0.03);
			System.out.println("Valor final com descontos: " + valorFinal);
		}

		else if ((litros > 20) && (escolha == 'a')) {
			valorFinal = (litros * 1.90);
			System.out.println("Valor final sem descontos: " + valorFinal);
			valorFinal = valorFinal - (valorFinal * 0.05);
			System.out.println("Valor final com descontos: " + valorFinal);
		}
		{
			if ((litros <= 20) && (escolha == 'b')) {
				valorFinal = (litros * 2.50);
				System.out.println("Valor final sem descontos: " + valorFinal);
				valorFinal = valorFinal - (valorFinal * 0.04);
				System.out.println("Valor final com descontos: " + valorFinal);
			}

			else if ((litros > 20) && (escolha == 'b')) {
				valorFinal = (litros * 2.50);
				System.out.println("Valor final sem descontos: " + valorFinal);
				valorFinal = valorFinal - (valorFinal * 0.06);
				System.out.println("Valor final com descontos: " + valorFinal);
			}

			entrada.close();
		}
	}
}
