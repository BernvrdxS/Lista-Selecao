import java.util.Scanner;

public class exercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um número: ");
		double numero = entrada.nextDouble();
		double arredondado = Math.round(numero);

		if (numero % 2 == 0) {
			System.out.println("Número par!");
		} else
			System.out.println("Ímpar!");

		if (numero == arredondado) {
			System.out.println("Número inteiro!");
		} else
			System.out.println("Número decimal!");

		if (numero > 0) {
			System.out.println("Número positivo!");
		}
		if (numero < 0) {
			System.out.println("Número negativo!");
		}
		if (numero == 0) {
			System.out.println("Zero!");
		}
		entrada.close();
	}

}
