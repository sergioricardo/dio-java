package introducao_e_conceitos_basicos;

// Aula 1.4 - Exemplo de atribuição de variáveis
 

public class Main {
	public static void main(String[] args) {
		
		int intA = 1;
		int intB = intA;
		
		System.out.println("int A = "+ intA + " int B = " + intB);
		intA = 2;
		System.out.println("int A = "+ intA + " int B = " + intB);
		
		MeuObjeto objA = new MeuObjeto(1);
		MeuObjeto objB = objA;
		
		System.out.println("objA = "+ objA + " objB = " + objB.toString());		
		
		
	}
}
