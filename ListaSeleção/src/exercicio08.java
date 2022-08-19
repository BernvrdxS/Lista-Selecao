import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe sua 1a nota:");
		float nota1 = entrada.nextFloat();
		System.out.print("Informe sua 2a nota: ");
		float nota2 = entrada.nextFloat();
		
		float media = ((nota1 + nota2)/2);
		
		
		if (media >= 6) {
			System.out.println("Aprovado!");
		}else 
			System.out.println("Reprovado!");
		
		entrada.close();
	}

}

