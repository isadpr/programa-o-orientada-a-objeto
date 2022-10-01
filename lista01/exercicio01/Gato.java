package exercicio1;

public class Gato {
		String cor;
		String nome;
		int idade;
		boolean vivo;
		
		void gatoVivo () {
			if(vivo == true) {
				System.out.println ("O gato " + nome + " esta vivo");
			}
			else {
				System.out.println ("O gato " + nome + " esta morto");
			}
		}
		
		void miar () {
			System.out.println ("O gato " + nome + " esta miando");
		}
		
}


