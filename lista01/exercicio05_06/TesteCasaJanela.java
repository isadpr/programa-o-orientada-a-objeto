package exercicios05_06;

public class TesteCasaJanela {
	public static void main (String args[]) { 
		Janela j1 = new Janela();
		j1.cor = "branca";
		j1.material = "vidro";

		Casa c1 = new Casa();
		c1.cor = "azul";
		c1.numero = 6;
		
		System.out.println("A casa de numero " + c1.numero + " tem cor " + c1.cor + 
		" e uma janela " + j1.cor + " de " + j1.material);
		
	}
}
