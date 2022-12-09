package lista09;

import java.util.Iterator;
import java.util.Map;

public class Exercicio2 {
	public static double contaA(Map<String, Integer> mapa) {
		double soma = 0;
		Iterator<String> it = mapa.keySet().iterator();
		
		while(it.hasNext()) {
			String chave = (String)it.next();
			if(chave.substring(0, 1).equals("A")) {
					Integer value = mapa.get(chave);
					soma+=value;
				}
			}
		
		return soma;
	}
}
