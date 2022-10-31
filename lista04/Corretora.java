package lista4_exercicio2;
import java.util.Scanner;

public class Corretora extends Imovel {
	
	public static double PrecosSomados(int tamanhoArray, Imovel[] imoveis) {
		double soma = 0;
		for (int i=0; i<tamanhoArray; i++) {
			soma = soma + imoveis[i].getPreco();
		}
		return soma;
	}
	
	public static void main(String[] args) {
		Imovel[] imoveis = new Imovel[5];
		Scanner texto = new Scanner(System.in);
		Scanner num = new Scanner(System.in);
		int tamanhoArray = imoveis.length;
		
		imoveis[0] = new Novo();
		imoveis[1] = new Novo();
		imoveis[2] = new Novo();
		imoveis[3] = new Velho();
		imoveis[4] = new Velho();
		
		for (int i=0; i<tamanhoArray; i++) {
			System.out.println("Insira o endereco do imovel numero " + (i+1) + " : ");
			imoveis[i].setEndereco(texto.nextLine());
			System.out.println("Insira o preco do imovel numero " + (i+1) + " : ");
			imoveis[i].setPreco(num.nextInt());
		}
		System.out.println(PrecosSomados(tamanhoArray,imoveis));
		texto.close();
		num.close();
	}
	
}
