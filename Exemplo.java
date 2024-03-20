package aula2003;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numero;
		System.out.println("Informe o número: ");
		numero = sc.nextInt();
		
		if(numero > 0) {
			System.out.println("O numero é positivo");
		}
		else if(numero == 0) {
			System.out.println("O numero é zero");
		}
		else {
			System.out.println("O numero é negativo");
		}
		
		sc.close();
	}

}
