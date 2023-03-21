package Exercicios_LoopJava;



import java.util.Scanner;

public class Ex1_NomeEIdade {
	public static void main(String[] args) {
		String nome;
		int idade;
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("Digite o nome da pessoa. 0 para sair:");
			nome = input.next();
			
			if (nome.equals("0")) {
				System.out.println("Saindo do programa!");
				break;
			}
			
			System.out.println("Agora digite a idade: ");
			idade = input.nextInt();	
		}
		
	}
}
