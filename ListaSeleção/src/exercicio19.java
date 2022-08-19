import java.util.Scanner;
import java.lang.Math;

public class exercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o valor de a: ");
		float a = entrada.nextFloat();
		System.out.println("Digite o valor de b: ");
		float b = entrada.nextFloat();
		System.out.println("Digite o valor de c: ");
		float c = entrada.nextFloat();

		double delta = 0;
		double raiz1 = 0;
		double raiz2 = 0;
		delta = (((b * b) - (4 * a * c)));

		if (delta < 0) {
			System.out.println("Não é uma equação de segundo grau!");
		} else {
			System.out.println("O delta tem valor de: " + delta);

			if (delta == 0) {
				raiz1 = ((-b) + (Math.sqrt(delta) / 2 * a));
				System.out.println("A equação possui apenas a raíz: " + raiz1);
			} else {
				raiz1 = ((-b) + (Math.sqrt(delta) / (2 * a)));
				raiz2 = ((-b) - (Math.sqrt(delta) / (2 * a)));
				System.out.println("As duas raízes da equação são: " + raiz1 + raiz2);

				entrada.close();
			}
		}
	}

}
