package Exercicios_LoopJava;

import java.util.Scanner;

public class Ex5_Tabuada {
	public static void main(String[] args) {
		
		int numeroDigitado;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número :");
		numeroDigitado = scan.nextInt();
		
		System.out.println("*** Tabuada do "+ numeroDigitado+" ***\n");
		for(int i = 0; i <= 10; i++) {
			System.out.println(numeroDigitado+" * "+i+" = "+(numeroDigitado * i));
			
		}
	}
}
