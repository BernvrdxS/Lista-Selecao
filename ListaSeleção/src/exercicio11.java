import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe seu turno - M (matutino),V (vespertino), N(noturno):");
		String turno = entrada.next();

		if ("M".equals(turno)) {
			System.out.println("Bom dia!");
		} else if ("V".equals(turno)) {
			System.out.println("Boa tarde!");
		} else if ("N".equals(turno))
			System.out.println("Boa noite!");

		entrada.close();
	}
}