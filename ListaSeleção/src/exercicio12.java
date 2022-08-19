import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe seu salário: ");
		float salario = entrada.nextFloat();

		double pequeno = salario * 1.20;
		double medio = salario * 1.15;
		double alto = salario * 1.10;
		double grande = salario * 1.05;

		System.out.println("Seu salário antes do reajuste é: " + salario);

		if (salario <= 280) {
			System.out.println("Seu salário aumentou 20%, agora é: " + pequeno);
		}
		if ((salario > 280) && (salario <= 700)); {
			System.out.println("Seu salário aumentou 15%, agora é: " + medio);
		} 
		if ((salario > 700) && (salario <= 1500)) {
				System.out.println("Seu salário aumentou 10%, agora é: " + alto);
			}
			if (salario > 1500); {
			System.out.println("Seu salário aumentou 5%, agora é:" + grande);

			entrada.close();
		}

	}

}
