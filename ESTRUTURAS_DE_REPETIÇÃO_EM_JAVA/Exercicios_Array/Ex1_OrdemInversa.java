package Exercicios_Array;

public class Ex1_OrdemInversa {
	public static void main(String[] args) {
	
		int[] vetor = {2,51,5,9,7,3};
						
		int count = 0;
		while(count < (vetor.length)) {
			System.out.print(vetor[count] + " ");
			count++;
		}
		
		System.out.print("\nVetor inverso:");
	for(int i = (vetor.length - 1); i == 0; i--) {
		System.out.print(vetor[i] + " ");
	}
		
}
}
