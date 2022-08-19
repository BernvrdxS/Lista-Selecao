import java.util.Scanner;

public class exercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um número menor que 1000 para ser decomposto: ");
		int numero = entrada.nextInt();

		int unidade = numero % 10;
		numero = (numero - unidade) / 10;

		int dezena = numero % 10;
		numero = (numero - dezena) / 10;

		int centena = numero;
		centena = numero;

		dezena = +dezena;
		centena = +centena;

		System.out.println(centena + "centena(s), " + dezena + " dezena(s) e " + unidade + " unidade(s)");
		entrada.close();
	}

}
