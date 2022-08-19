import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe um número: ");
		int numero1 = entrada.nextInt();
		System.out.print("Informe um número: ");
		int numero2 = entrada.nextInt();
		System.out.print("Informe um número: ");
		int numero3 = entrada.nextInt();

		if (numero1 > numero2 && numero2 > numero3) {
			System.out.println(+numero1);
			System.out.println(+numero3);

		} else if (numero1 > numero3 && numero3 > numero2) {
			System.out.println(+numero1);
			System.out.println(+numero2);

		} else if (numero2 > numero1 && numero1 > numero3) {
			System.out.println(+numero2);
			System.out.println(+numero3);

		} else if (numero2 > numero3 && numero3 > numero1) {
			System.out.println(+numero2);
			System.out.println(+numero1);

		} else if (numero3 > numero1 && numero1 > numero2) {
			System.out.println(+numero3);
			System.out.println(+numero2);

		} else if (numero3 > numero2 && numero2 > numero1) {
			System.out.println(+numero3);
			System.out.println(+numero1);

		}
		entrada.close();
	}

}
