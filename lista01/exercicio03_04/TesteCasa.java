package exercicios03_04;

public class TesteCasa {
	public static void main (String args[]) {
		Casa c1 = new Casa();
		c1.cor = "azul";
		c1.numero = 6;
		
		Casa c2 = new Casa();
		c2.cor = "vermelha";
		c2.numero = 10;
		
		System.out.println("A casa de numero " + c1.numero + " tem cor " + c1.cor);
		System.out.println("A casa de numero " + c2.numero + " tem cor " + c2.cor);
		
	}
}
