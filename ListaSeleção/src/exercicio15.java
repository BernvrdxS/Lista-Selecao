import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o preço de custo do seu produto");
		float valor = entrada.nextFloat();
		System.out.print("Digite o número correspondente a sua área");
		System.out.println("1- Sul");
		System.out.println("2- Norte");
		System.out.println("3- Leste");
		System.out.println("4- Oeste");
		System.out.println("5 ou 6- Nordeste");
		System.out.println("7 ou 8- Centro Oeste");
		int numero = entrada.nextInt();

		switch (numero) {

		case (1):
			System.out.println("O valor do seu produto é:" + valor);
			System.out.println("Sua origem é do sul");
			break;
		case (2):
			System.out.println("O valor do seu produto é:" + valor);
			System.out.println("Sua origem é do norte");
			break;
		case (3):
			System.out.println("O valor do seu produto é:" + valor);
			System.out.println("sua origem é do leste");
			break;
		case (4):
			System.out.println("O valor do seu produto é:" + valor);
			System.out.println("Sua origem é do oeste");
			break;
		case (5):
			System.out.println("O valor do seu produto é:" + valor);
			System.out.println("Sua origem é do nordeste");
			break;
		case (6):
			System.out.println("O valor do seu produto é:" + valor);
			System.out.println("Sua origem é do nordeste");
			break;
		case (7):
			System.out.println("O valor do seu produto é:" + valor);
			System.out.println("Sua origem é do centro oeste");
			break;
		case (8):
			System.out.println("O valor do seu produto é:" + valor);
			System.out.println("Sua origem é do centro oeste");
			break;

		default:
			System.out.println("Importado");
			entrada.close();
		}

	}
}
