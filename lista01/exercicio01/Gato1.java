package exercicio1;

public class Gato1 {
		public static void main(String[] args) {
			
			Gato g1 = new Gato();
			g1.nome = "Thi";
			g1.idade = 6;
			g1.vivo = true;
			
			Gato g2 = new Gato();
			g2.nome = "Isa";
			g2.idade = 9;
			g2.vivo = false;
			
			System.out.println("Nome: " + g1.nome);
			System.out.println("Idade: " + g1.idade);
			g1.gatoVivo();
			g1.miar();
			
			System.out.println("Nome: " + g2.nome);
			System.out.println("Idade: " + g2.idade);
			g2.gatoVivo();
		}
	}

