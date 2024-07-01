package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double mediaFinal = 0.0;
		final int P1 = 2;
		final int P2 = 3;
		final int P3 = 4;
		final int P4 = 1;
		
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		double n4 = sc.nextDouble();
		
		double media = (P1 * n1 + P2 * n2 + P3 * n3 + P4 * n4) / (P1 + P2 + P3 +P4);
		
		if (media >= 7.0) {
			System.out.println("Media: " + String.format("%.1f", media));
			System.out.println("Aluno aprovado.");
		}
		else if (media < 5) {
			System.out.println("Media: " + String.format("%.1f", media));
			System.out.println("Aluno reprovado.");
		}
		else if (media >= 5 && media <= 6.9) {
			System.out.println("Media: " + String.format("%.1f", media));
			System.out.println("Aluno em exame.");
			double exame = sc.nextDouble();
			System.out.println("Nota do exame: " + exame);
			mediaFinal = (media + exame) / 2;
			if (mediaFinal >= 5.0) {
				System.out.println("Aluno aprovado.");
				System.out.println("Media final: " + String.format("%.1f", mediaFinal));
			}
			else {
				System.out.println("Aluno reprovado.");
			}
			
			
		}
		
		sc.close();
	}
			
		

}
