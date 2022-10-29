package lista4_exercicio1;
import java.util.Scanner;

public class ArrayInvertido {
	public static void main (String[] args) {
		int[] arrayOriginal = new int[5];
		int tamanhoArray = arrayOriginal.length;
		int[] arrayAux = new int[5];
		Scanner num = new Scanner(System.in);
		
		for(int i=0; i<tamanhoArray; i++) {
			System.out.println("Digite um numero: ");
			arrayOriginal[i]=num.nextInt(); //nextLine -> String
		}
		num.close();
	
		for(int i=0; i<tamanhoArray; i++) {
			arrayAux[i]=arrayOriginal[tamanhoArray-1-i];
			System.out.println(arrayAux[i]);
		}

	}
}
 