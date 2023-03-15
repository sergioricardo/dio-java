package Escopo;

public class Conta {
	double saldo = 10.0;
	
	public double sacar (double valor) {
		//variável local de método
		double novoSaldo = saldo - valor;
		return novoSaldo;
	}
	
}
