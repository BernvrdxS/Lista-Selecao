import java.util.Scanner;
import java.lang.Math;

public class exercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um número: ");
		double num = entrada.nextDouble();
		double arredondado = Math.round(num);
		if (num == arredondado) {
			System.out.println("Número inteiro!");
		} else
			System.out.println("Número decimal!");

		entrada.close();

	}

}
