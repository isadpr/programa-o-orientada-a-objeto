package aulaDia25;

import java.util.HashMap;

public class Mapa {
	public static void main(String[] agrs) {
		HashMap x = new HashMap();
		x.put("Mario", "1327");
		x.put("Amanda", "444");
		x.put("Luana", "444");
		System.out.println(x.get("Luana"));
	}
}
