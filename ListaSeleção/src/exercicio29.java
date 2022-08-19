import java.util.Scanner;

public class exercicio29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int classificacao = 0;

		System.out.print("Responda essas perguntas com s(sim) ou n(não).");

		System.out.print("Telefonou para a vítima?");
		char resposta1 = entrada.next().charAt(0);

		System.out.print("Esteve no local do crime?");
		char resposta2 = entrada.next().charAt(0);

		System.out.print("Mora perto da vítima?");
		char resposta3 = entrada.next().charAt(0);

		System.out.print("Devia para a vítima?");
		char resposta4 = entrada.next().charAt(0);

		System.out.print("Já trabalhou com a vítima?");
		char resposta5 = entrada.next().charAt(0);

		if (resposta1 == 's') {
			classificacao = classificacao + 1;
		}
		if (resposta2 == 's') {
			classificacao = classificacao + 1;
		}
		if (resposta3 == 's') {
			classificacao = classificacao + 1;
		}
		if (resposta4 == 's') {
			classificacao = classificacao + 1;
		}
		if (resposta5 == 's') {
			classificacao = classificacao + 1;
		}
		if (classificacao == 2) {
			System.out.println("Suspeito!");
		} else if ((classificacao > 3) && (classificacao < 4)) {
			System.out.println("Cumplice!");
		} else if (classificacao == 5) {
			System.out.println("Assassino!");

			entrada.close();

		}
	}
}
