package aulaDia25;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MainAluno {
	public static void main(String[] args) {
		HashMap alunos = new HashMap();
		List x = getAlunos();
	
		Iterator it = x.iterator();
		while(it.hasNext()) {
			String s=(String)it.next();
			String[] matriculaNota = s.split("#");
			alunos.put(matriculaNota[0], new Aluno(matriculaNota[0], Double.parseDouble(matriculaNota[1])));
		}
		
		System.out.println(media(alunos));
	}
	
	public static double media(Map m) {
		Collection c = m.values();
		double soma=0;
		Iterator it = c.iterator();
		while(it.hasNext()) {
			Aluno o = (Aluno)it.next();
			soma+=o.getNotaFinal();
		}
		return soma/m.values().size();
	}
	
	public static List getAlunos() {
		ArrayList x = new ArrayList();
		x.add("mat32#8");
		x.add("mat55#7");
		
		return x;
	}
}
