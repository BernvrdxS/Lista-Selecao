import java.util.Scanner;

public class exercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um dia: ");
		int dia = entrada.nextInt();
		System.out.println("Informe um mês: ");
		int mes = entrada.nextInt();
		System.out.println("Informe um ano: ");
		int ano = entrada.nextInt();

		if ((mes >= 1) && (mes <= 12)) {
			if (dia <= 30) {
				if (ano >= 0) {
					System.out.println("A data é válida!");

				} else
					System.out.println("A data é inválida!");
			}
		}
		entrada.close();
	}

}
