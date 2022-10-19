package lista2_exercicio3;

public class SomaImpares {
	public static void main (String[] args) {
		int num;
		int soma = 0;
		
		for(num=1; num<=10000; num++) {
			if (num%2!=0) {
				soma = soma + num;
			}
		}
		
		System.out.println (soma);
	}
}
