package exercicio01_02;

public class GatoTeste {
	public static void main(String[] args) {
		
		Gato g1 = new Gato();
		g1.nome = "Thi";
		g1.cor = "Laranja";
		g1.idade = 6;
		g1.vivo = true;
		
		Gato g2 = new Gato();
		g2.nome = "Isa";
		g2.cor = "Cinza";
		g2.idade = 9;
		g2.vivo = true;
		
		Gato g3 = new Gato();
		g3.nome = "Niu";
		g3.cor = "Preto";
		g3.idade = 15;
		g3.vivo = false;
	
		System.out.println("Gato 1: " + g1.nome + " - " + g1.cor + " - " + g1.idade + " - " + g1.vivo);
		System.out.println("Gato 2: " + g2.nome + " - " + g2.cor + " - " + g2.idade + " - " + g2.vivo);
		System.out.println("Gato 3: " + g3.nome + " - " + g3.cor + " - " + g3.idade + " - " + g3.vivo);

	}
}
