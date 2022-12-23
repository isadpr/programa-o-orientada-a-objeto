package aulaNatal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main (String[] args) {
		List<String> x = new ArrayList<String>();
		x.add("vermelho");
		x.add("vermelho");
		x.add("verde");
		x.add("amarelo");
		
		System.out.println(Collections.frequency(x, "vermelq	ho"));
		
		Collections.shuffle(x);
		System.out.println(x);
	}
}
