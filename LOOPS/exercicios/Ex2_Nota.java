package exercicios;

import java.util.Scanner;

public class Ex2_Nota {
	public static void main(String[] args) {
		
		/* peça uma nota de 0 a 10
		 * mostrar uma mensagem caso o valor seja inválido
		 */
		
		int nota;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma nota entre 0 e 10");
		nota = scan.nextInt();
		
		while (nota < 0 || nota > 10) {
			System.out.println("Valor inválido. Digite novamente: ");
			nota = scan.nextInt();
		}
		
		if (nota < 7)
			System.out.println("Reprovado");
		else {
			System.out.println("Aprovado");
		}
				
	}
}
