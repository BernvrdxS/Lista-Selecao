import java.util.Scanner;

public class exercicio33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe suas respostas: ");
		char resposta1 = entrada.next().charAt(0);
		char resposta2 = entrada.next().charAt(0);
		char resposta3 = entrada.next().charAt(0);
		char resposta4 = entrada.next().charAt(0);
		char resposta5 = entrada.next().charAt(0);
		char resposta6 = entrada.next().charAt(0);
		char resposta7 = entrada.next().charAt(0);
		char resposta8 = entrada.next().charAt(0);
		char resposta9 = entrada.next().charAt(0);
		char resposta10 = entrada.next().charAt(0);

		if (resposta1 == 'a') {
			System.out.println("Correto!");
		}
		if (resposta2 != 'a') {
			System.out.println("Errado, resposta correta: (a)");
		}
		if (resposta3 == 'b') {
			System.out.println("Correto!");
		}
		if (resposta4 != 'b') {
			System.out.println("Errado, resposta correta: (b)");
		}
		if (resposta5 != 'c') {
			System.out.println("Errado, resposta correta: (c)");
		}
		if (resposta6 == 'c') {
			System.out.println("Correto!");
		}
		if (resposta7 != 'd') {
			System.out.println("Errado, resposta correta: (d)");
		}
		if (resposta8 == 'd') {
			System.out.println("Correto!");
		}
		if (resposta9 != 'e') {
			System.out.println("Errado, resposta correta: (e)");
		}
		if (resposta10 == 'e') {
			System.out.println("Correto!");
		}

		entrada.close();
	}

}
