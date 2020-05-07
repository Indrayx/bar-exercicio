package problemabar;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cerveja,refrigerante,espetinho;
		char sexo;
		double consumo,total;
		
		System.out.print("Sexo : ");
		sexo = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas : ");
		cerveja = sc.nextInt();
		System.out.print("Quantidade de refrigerantes : ");
		refrigerante = sc.nextInt();
		System.out.print("Qauntidade de espetinhos : ");
		espetinho = sc.nextInt();
		
		
		
		sc.close();
	}

}
