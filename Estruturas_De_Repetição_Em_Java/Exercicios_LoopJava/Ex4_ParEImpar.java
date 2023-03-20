package Exercicios_LoopJava;

import java.util.Scanner;

public class Ex4_ParEImpar {
	public static void main(String[] args) {
		int numeroDigitado = 0;
		int quantidadeNumeroPar = 0;
		int quantidadeNumeroImpar = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
		
		System.out.println("Por favor, digite um número :");
		numeroDigitado = scan.nextInt();
		
		if (numeroDigitado % 2 == 0) {
			quantidadeNumeroPar++;
		}else {
			quantidadeNumeroImpar++;
		}
		
		}while (numeroDigitado != 0);
		
		System.out.println("Total de números pares digitados: " + quantidadeNumeroPar);
		System.out.println("Total de números impares digitados: " + quantidadeNumeroImpar);
}
}
