package br.com.lojacefet.main;

import br.com.lojacefet.instrumentos.*;  // * -> importa todas as classes do pacote

public class Teste {
	public static void main (String[] args) {
		Teclado c1 = new Teclado();
		br.com.lojacefet.instrumentos.Teclado c2 = new br.com.lojacefet.instrumentos.Teclado();
		//System.out.println(c1.getNumeroTeclas());
		System.out.println(c2.getNumeroSons());
		
		Violino v1 = new Violino();
		System.out.println(c2.getNumeroSons());
	}
}