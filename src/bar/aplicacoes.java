package bar;

import java.util.Locale;
import java.util.Scanner;

public class aplicacoes {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char sexo;
		int cervejas, refrigerantes, espetos;
		
		System.out.print("Sexo: ");
		sexo = sc.next().charAt(0);
		
		System.out.print("Quantidade de cervejas: ");
		cervejas = sc.nextInt();
		
		System.out.print("Quantidade de refrigerantes: ");
		refrigerantes = sc.nextInt();
		
		System.out.print("Quantidade de espetos: ");
		espetos = sc.nextInt();
		
		
		
		sc.close();

	}

}
