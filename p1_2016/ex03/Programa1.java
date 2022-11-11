package p1_2016_questao3;
import java.util.Scanner;

public class Programa1 {
	public static void main (String[] args) {
	Carro car = new Carro();
	Motor mot = new Motor();
	car.setMotor(mot);
	Scanner sc = new Scanner(System.in);
	int id = sc.nextInt();
	car.setId(id);
	String color = sc.nextLine();
	mot.setCor(color);
	sc.close();
	imprimeDadosCarro(car);
	}
	public static void imprimeDadosCarro(Carro n) {
		System.out.println("Cor do motor: " + n.getMotor().getCor());
	}
}
