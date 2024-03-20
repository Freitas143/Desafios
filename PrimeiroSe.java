package aula2003;

import java.util.Scanner;

public class PrimeiroSe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner (System.in);
		double n1,n2,n3,n4, media;
		System.out.println("Primeira nota: ");
		n1 = src.nextDouble();
		System.out.println("Segunda nota: ");
		n2 = src.nextDouble();
		System.out.println("Terceira nota: ");
		n3 = src.nextDouble();
		System.out.println("Quarta nota: ");
		n4 = src.nextDouble();
		
		media = (n1+n2+n3+n4)/4;
		
		if(media < 7 && media >= 0 ) {
			System.out.println("Reprovado "+media);
		}
		else {
			System.out.println("Aprovado "+media);
		}
		src.close();
	}

}
