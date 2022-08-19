import java.util.Scanner;

public class exercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a idade do 1o aluno: ");
		int idade1 = entrada.nextInt();
		System.out.println("Informe a idade do 2o aluno: ");
		int idade2 = entrada.nextInt();
		System.out.println("Informe a idade do 3o aluno: ");
		int idade3 = entrada.nextInt();

		int mediaIdade = ((idade1 + idade2 + idade3) / 3);

		if (mediaIdade < 25) {
			System.out.println("Turma Jovem!");

		} else if ((mediaIdade > 25) && (mediaIdade <= 40)) {
			System.out.println("Turma Adulta!");
		} else {
			System.out.println("Turma Idosa!");

			entrada.close();

		}
	}
}
