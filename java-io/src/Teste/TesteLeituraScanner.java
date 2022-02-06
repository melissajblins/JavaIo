package Teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScanner {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");

		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
//			System.out.println(linha);

			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");

			String tipo = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();

			System.out.format(new Locale("pt", "BR"),
					"Tipo da Conta: %s, Agência: %04d, Número: %d, Titular: %s, Saldo: %.2f %n", tipo, agencia, numero,
					titular, saldo);

			linhaScanner.close();
		};

		scanner.close();
	}
}
