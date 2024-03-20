package aula2003;

import java.util.Scanner;

public class exer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ds;
		System.out.println("Digite o número do dia da semana (1-7): ");
		ds = sc.nextInt();
		
		if(ds == 1) {
			System.out.println("Segunda");
		}
		else if(ds == 2) {
			System.out.println("Terça");
		}
		else if(ds == 3) {
			System.out.println("Quarta");
		}
		else if(ds == 4) {
			System.out.println("Quinta");
		}
		else if(ds == 5) {
			System.out.println("Sexta");
		}
		else if(ds == 6) {
			System.out.println("Sabado");
		}
		else if(ds == 7) {
			System.out.println("Domingo");
		}
		else {
			System.out.println("Dia inválido");
		}
		
		
		
		sc.close();

	}

}
