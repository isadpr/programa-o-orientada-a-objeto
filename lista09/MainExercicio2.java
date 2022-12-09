package lista09;

import java.util.HashMap;
import java.util.Map;

public class MainExercicio2 {
	public static void main(String[] args) {
		Map<String, Integer> mapa = new HashMap<String, Integer>();
		
		mapa.put("A1", 5);
		mapa.put("A2", 6);
		mapa.put("A3", 7);
		mapa.put("BD21", 3);
		mapa.put("B2", 7);
		mapa.put("AC74", 2);
		mapa.put("A5", 8);
		mapa.put("B3", 3);
		
		System.out.println(Exercicio2.contaA(mapa));
	}
}
