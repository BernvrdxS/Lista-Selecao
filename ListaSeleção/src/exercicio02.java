import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.print("Informe um número: ");
	    int numero = entrada.nextInt();
	    
	    if (numero > 0)
	    	System.out.println("Positivo!");
	    if (numero == 0)
	    	System.out.println("Zero!");
	    if (numero < 0)
	    	System.out.println("Negativo!");
	    
	    entrada.close();
	}

}
