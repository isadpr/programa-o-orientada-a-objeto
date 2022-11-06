package lista4_exercicio6;

//O código compila.

public class Processa3 {
	public static void main (String[] args) {
		 Processa3 s = new Processa3();
		 System.out.println(s.calcula(2,3));
	 }
	 public double calcula(double a, double b) {
		 return (a+b)*(a*0.1)+(b*0.9);
	 } 
}
