import java.util.Scanner;

public class exercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um n�mero: ");
		double numero = entrada.nextDouble();
		double arredondado = Math.round(numero);

		if (numero % 2 == 0) {
			System.out.println("N�mero par!");
		} else
			System.out.println("�mpar!");

		if (numero == arredondado) {
			System.out.println("N�mero inteiro!");
		} else
			System.out.println("N�mero decimal!");

		if (numero > 0) {
			System.out.println("N�mero positivo!");
		}
		if (numero < 0) {
			System.out.println("N�mero negativo!");
		}
		if (numero == 0) {
			System.out.println("Zero!");
		}
		entrada.close();
	}

}
