import java.util.Scanner;
public class exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner entrada = new Scanner(System.in);
	    
	     System.out.print("Informe dois n�meros: ");
	     int numero1 = entrada.nextInt();
	     int numero2 = entrada.nextInt();
	     
	     if (numero1 > numero2)
	    	 System.out.println("O maior n�mero informado foi: "+numero1);
	     
	     if (numero2 > numero1)
	    	 System.out.println("O maior n�mero informado foi: "+numero2);
	     
	     entrada.close();

	}

}
