package aulaDia25;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		HashSet x = new HashSet();
		x.add("casa");
		x.add("bola");
		x.add("cama");
		x.add("mesa");
		x.add("casa"); //nao entra elemento repetido
		System.out.println(x.add("casa"));
		System.out.println(x);
	}
	
	 public static double Media(Collection x) { //pode mudar la em cima para arraylist sem problemas, entra qualquer coleção
		 double soma = 0;
		 Iterator it = x.iterator();
		 while(it.hasNext()) {
			 String s=(String)it.next();
			 soma+=s.length();
		 }
		 return soma/x.size();
	}
}

// ArrayList ----> List -> COLLECTION <- Set <---- HashSet