import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um n?mero correspondente a um dia da semana: ");
		int num = entrada.nextInt();

		switch (num) {

		case (1):
			System.out.println("Domingo!");
			break;
		case (2):
			System.out.println("Segunda!");
			break;
		case (3):
			System.out.println("Ter?a!");
			break;
		case (4):
			System.out.println("Quarta!");
			break;
		case (5):
			System.out.println("Quinta!");
			break;
		case (6):
			System.out.println("Sexta!");
			break;
		case (7):
			System.out.println("S?bado!");
			break;

		default:
			System.out.println("Dia da semana inv?lido!");
			break;
		}
		entrada.close();
	}

}
