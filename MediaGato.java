import java.util.Scanner;

public class Sistema {
	public static void main(String[] args) {		
		Scanner lendoLinha= new Scanner(System.in);
		Gato [] g= new Gato[3];
		int mediaIdade = 0;
		for(int i=0; i<3;i++) {
			g[i] = new Gato();
			System.out.println("digite o nome do gato: ");
			g[i].nome = lendoLinha.nextLine();
			System.out.println("digite a idade do " + g[i].nome + ": ");
			g[i].idade = lendoLinha.nextInt();
		}
		for(int j=0; j<3; j++) {
			mediaIdade = mediaIdade + g[j].idade;
		}
		System.out.println("a media das idades dos gatos: " + mediaIdade/3);
	}
}
 
