import java.util.Scanner;

public class exercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o valor do saque: ");
		int saque = entrada.nextInt();

		int garoupa = saque / 100;

		if (garoupa > 0) {
			System.out.println(garoupa);
			saque = saque - (garoupa * 100);
			System.out.println(garoupa + "nota(s) de 100");

		}
		int onca = saque / 50;
		if (onca > 0) {
			System.out.println(onca);
			saque = saque - (onca * 50);
			System.out.println(onca + "nota(s) de 50");

		}
		int mico = saque / 20;
		if (mico > 0) {
			System.out.println(mico);
			saque = saque - (mico * 20);
			System.out.println(mico + "nota(s) de 20");

		}
		int arara = saque / 10;
		if (arara > 0) {
			System.out.println(arara);
			saque = saque - (arara * 10);
			System.out.println(arara + "nota(s) de 10");

		}
		int garca = saque / 5;
		if (garca > 0) {
			System.out.println(garca);
			saque = saque - (garca * 5);
			System.out.println(garca + "nota(s) de 5");

		}
		int tartaruga = saque / 2;
		if (tartaruga > 0) {
			System.out.println(tartaruga);
			saque = saque - (tartaruga * 2);
			System.out.println(tartaruga + "nota(s) de 2");

		}
		int passaro = saque / 1;
		if (passaro > 0) {
			System.out.println(passaro);
			saque = saque - (passaro * 1);
			System.out.println(passaro + "nota(s) de 1");

			entrada.close();
		}
	}

}
