package Exercicios_LoopJava;

import java.util.Scanner;


public class Ex6_Fatorial {
	public static void main(String[] args) {
		
		int numeroDigitado;
		int valorFatorial = 1;
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor para decomposição Fatorial :");
		numeroDigitado = scan.nextInt();
		
		for(int contador = numeroDigitado; contador >= 1; contador-- ) {
			valorFatorial = valorFatorial * contador;
			}
		System.out.printf("O valor do fatorial %d é %d", numeroDigitado, valorFatorial);
	}
}

/*importante. Por se tratar de um teste para fatorial, pelo fato das variáveis serem Int, existe um limite para
 * fatorial que, passando esse valor, o resultado chega em zero.
 */
 

