import java.util.Scanner;

public class exercicio26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um n�mero: ");
		int numero = entrada.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("N�mero par!");}
			else 
				System.out.println("�mpar!");
		entrada.close();
	}

}
