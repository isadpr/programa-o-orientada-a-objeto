import java.util.ArrayList;

public class Lista {
	public static void main (String[] args) {
		ArrayList x = new ArrayList();
		x.add("casa");
		x.add("mesa");
		x.add("cama");
		x.add("navio");
		System.out.println(x.size());
		System.out.println(x);
		x.remove("cama");
		System.out.println(x);
	}
}
