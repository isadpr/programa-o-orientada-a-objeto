package p2_2022_2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira uma frase: ");
		String texto = sc.nextLine();
		
		System.out.println(Utils2.moderar(texto));
	}
}
