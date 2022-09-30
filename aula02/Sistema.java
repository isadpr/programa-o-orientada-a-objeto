
public class Sistema {
	public static void main(String[] args) {
		Gato g1 = new Gato();
		Gato g2 = new Gato();
		g1.nome = "Felix";
		g1.idade = 10;
		g2.nome = "Tom";
		g2.idade = 8;
		System.out.println("Nome: " + g1.nome);
		System.out.println("Idade: " + g1.idade);
		System.out.println("Nome: " + g2.nome);
		System.out.println("Idade: " + g2.idade);
		g1.miar();
		g2.miar();
	}
}
