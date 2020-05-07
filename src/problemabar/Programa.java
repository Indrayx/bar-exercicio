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
		
		// 1 Leitura dos dados
		System.out.print("Sexo : ");
		sexo = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas : ");
		cerveja = sc.nextInt();
		System.out.print("Quantidade de refrigerantes : ");
		refrigerante = sc.nextInt();
		System.out.print("Qauntidade de espetinhos : ");
		espetinho = sc.nextInt();
		
		// 2 Calculos + Relatório gerado
		
consumo =  (espetinho * 7) + (cerveja * 5) + (refrigerante * 3);
		
		if(sexo == 'F' || sexo == 'f') { 
			if(consumo > 30 ) { 
				total = consumo + 8;
				System.out.println("RELATÓRIO : ");
				System.out.printf("Consumo = R$%.2f%n " , consumo);
				System.out.println("Isento de couvert");
				System.out.println("Ingresso = R$ 8,00");
				System.out.printf("Valor a pagar = R$%.2f%n " , total);
			} else {
				total = consumo + 8 + 4;
				System.out.println("RELATÓRIO : ");
				System.out.printf("Consumo = R$%.2f%n " , consumo);
				System.out.println("Couvert = R$ 4,00");
				System.out.println("Ingresso = R$ 8,00");
				System.out.printf("Valor a pagar = R$%.2f%n " , total);
			}
		}
			
			else {
				if(consumo > 30 ) { 
					total = consumo + 10;
					System.out.println("RELATÓRIO : ");
					System.out.printf("Consumo = R$%.2f%n " , consumo);
					System.out.println("Isento de couvert");
					System.out.println("Ingresso = R$ 10,00");
					System.out.printf("Valor a pagar = R$%.2f%n " , total);
				} else {
					total = consumo + 10 + 4;
					System.out.println("RELATÓRIO : ");
					System.out.printf("Consumo = R$%.2f%n " , consumo);
					System.out.println("Couvert = R$ 4,00");
					System.out.println("Ingresso = R$ 10,00");
					System.out.printf("Valor a pagar = R$%.2f%n " , total);
				}
			}
		
		
		sc.close();
	}

}
