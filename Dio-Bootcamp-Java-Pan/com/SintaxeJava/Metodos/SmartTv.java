package com.SintaxeJava.Metodos;

public class SmartTv {
	//atributos
	boolean ligada = false;
	int canal = 1;
	int volume = 1;
	
	public void aumentarCanal() {
		canal++;
	}
	
	public void diminuirCanal() {
		canal--;
	}
	
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}
	
}
