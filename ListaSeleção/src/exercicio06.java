import java.util.Scanner;

public class exercicio06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um n�mero: ");
		int numero = entrada.nextInt();
		
		if (numero % 2 == 0) {
			int numero2 = (numero + 1);
			System.out.println("O n�mero par informado foi : " +numero2);		
		}
		if (numero % 2 != 0) {
			int numero2 = (numero + 1);
			System.out.println("O n�mero �mpar informado foi : " +numero2);		

		}
		entrada.close();
	}

}
