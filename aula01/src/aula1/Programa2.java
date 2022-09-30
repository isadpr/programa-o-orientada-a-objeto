package aula1;

public class Programa2 {
	public static void main(String[] args) {
		System.out.println("oi");
		
		Carro c1 = new Carro();
		c1.cor = "azul";
		System.out.println(c1.cor);
		
		Carro c2 = new Carro();
		c2.cor="vermelho";
		System.out.println(c2.cor);
		
		Carro c3 = c1;
		c3.cor = "verde";
		System.out.println(c3.cor);
		System.out.println(c1.cor);
		
		c2 = new Carro();
	}
}
