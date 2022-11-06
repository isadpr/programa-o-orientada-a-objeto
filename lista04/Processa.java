package lista4_exercicio3_4;

/* Erro no código: não é possível fazer uma referência estática a um método não estático. 
 * A solução seria tornar o método calcula estático ou instanciar um objeto.
 * 
 * Metódos estáticos geralmente são utilizados visando o compartilhamento de informações entre os objetos
 * e para acesso direto aos atributos da classe, sem necessidade de existir algum objeto instanciado na classe
*/

public class Processa {
	public static void main (String[] args) {
		System.out.println(calcula(2,3));
	}
	public static double calcula(double a, double b) {
		return (a+b)*(a*0.1)+(b*0.9);
	}
}
