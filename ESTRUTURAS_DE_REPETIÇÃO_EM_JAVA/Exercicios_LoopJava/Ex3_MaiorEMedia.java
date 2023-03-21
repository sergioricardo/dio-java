package Exercicios_LoopJava;

import java.util.Scanner;

/* Fazer um programa que leia 5 números
 * e informe o maior número e a média desses números.
 * Aqui, neste caso, vou fazer uma construção em que o DENOMINADOR 
 * vai alterando conforme vai sendo digitado os números, o que possibilita trabalhar
 * com quantidades variáveis de números.
 */

public class Ex3_MaiorEMedia {
	public static void main(String[] args) {
		
		//Variáveis
		int quantidadeDigitada = 0;
		double valorDigitado;
		double valorMaximo = 0;
		double soma = 0;
		double media = 0.0;
		
		//Entrada de dados e processamento
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Digite o número "+(quantidadeDigitada + 1)+ ":");
			valorDigitado = input.nextInt();
			
			if (valorDigitado > valorMaximo)
				valorMaximo = valorDigitado;
				
			soma += valorDigitado;
			quantidadeDigitada = quantidadeDigitada + 1;
		}while(quantidadeDigitada < 5);
				
		media = soma / quantidadeDigitada;
		//Resultados
		System.out.println("\n*** Resultado ***\n");
		System.out.printf("Valor Máximo : %.2f\n", valorMaximo);
		System.out.printf("\nTotal da Soma :%.2f\n", soma);
		System.out.printf("\nMédia :%.2f\n", media);
		System.out.println("\n*** Fim do programa ***");
	}
}
