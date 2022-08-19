import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe uma letra para saber se ela é vogal: ");
		char vogal = entrada.next().charAt(0);
		
		switch (vogal) {
		
		case 'a':
			System.out.println("É uma vogal!");
			
		case 'e':
			System.out.println("É uma vogal!");
			
		case 'i':
			System.out.println("É uma vogal!");
		
		case 'o':
			System.out.println("É uma vogal!");
			
		case 'u':
			System.out.println("É uma vogal!");
		
			default:
				System.out.println("Não é uma vogal!!!");
			
		}
		
	
		
		
		entrada.close();
		
	}

}
