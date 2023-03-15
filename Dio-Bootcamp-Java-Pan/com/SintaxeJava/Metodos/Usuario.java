package com.SintaxeJava.Metodos;

public class Usuario {
	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		System.out.println("TV ligada ?" + smartTv.ligada);
		System.out.println("Qual canal ?" + smartTv.canal);
		
		smartTv.ligar();
		
		System.out.println("TV ligada ?" + smartTv.ligada);
		
	}
}
