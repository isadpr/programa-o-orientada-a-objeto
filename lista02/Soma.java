package lista2_exercicio04;

public class Soma {
	public static void main (String args[]) {
		int num;
		int soma = 0;
		
		for(num=1; num<=50000; num++) {
			if(num<=100 || num>=137){
				soma+=num;
			}
		}
		
		System.out.println(soma);
	}
}
