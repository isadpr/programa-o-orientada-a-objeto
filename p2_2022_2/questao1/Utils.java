package p2_2022_2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utils {
	public static Map retornaMapa (List listaNinjas) {
		Map mapaNinjas = new HashMap();
		
		for(int i=0; i<listaNinjas.size(); i++) {
			Ninja n = (Ninja) listaNinjas.get(i);
			mapaNinjas.put(n.getCpf(), n);
		}
		return mapaNinjas;
	}
}
