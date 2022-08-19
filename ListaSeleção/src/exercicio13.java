import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o valor recebido por hora trabalhada: ");
		System.out.print("Informe a quantidade de horas trabalhadas no mes. ");
		int hora = entrada.nextInt();
		int quantHora = entrada.nextInt();

		double salarioBruto = hora * quantHora;
		double inss = (salarioBruto * 10) / 100;
		double impostoRenda = (salarioBruto * 5) / 100;
		double fgts = (salarioBruto * 11) / 100;
		double sindicato = (salarioBruto * 3) / 100;
		double salario = 0;

		if (salarioBruto <= 900) {
			System.out.println("Isento de imposto!");
		} else if ((salarioBruto > 900) && (salarioBruto <= 1500)) {
			salario = salarioBruto - impostoRenda - inss;
		} else if ((salarioBruto > 1500) && (salarioBruto <= 2500)) {
			salario = salarioBruto - impostoRenda - inss;

		} else {
			salario = salarioBruto - impostoRenda - inss;
		}

		System.out.println("Seu salário bruto é: " + salarioBruto);
		System.out.println("O valor do seu FGTS é: " + fgts);
		System.out.println("O valor de INSS é: " + inss);
		System.out.println("O valor de imposto de renda é:" + impostoRenda);
		System.out.println("O valor que você paga ao sindicato é: " + sindicato);
		System.out.println("Seu salário liquído é: " + salario);

		entrada.close();

	}
}
