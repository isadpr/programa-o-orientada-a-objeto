package p2_2022_2;

import java.util.ArrayList;
import java.util.List;

public class Academia {
	private String nome;
	private List listaNinjas;
	
	public Academia(String nome) {
		this.nome = nome;
		listaNinjas = new ArrayList();
	}
	
	public List getListaNinjas() {
		return listaNinjas;
	}
	
	public void matriculaNinja(Ninja e) {
		listaNinjas.add(e);
	}
	
	public boolean imprimeDadosNinjaSeExistir(Ninja e) {
		if(listaNinjas.contains(e)) {
			int idx = listaNinjas.indexOf(e);
			Ninja n = (Ninja)listaNinjas.get(idx);
			System.out.println(n);
			return true;
		}
		else {
			System.out.println("não existe ninja com esse cpf");
			return false;
		}
	}
	
	public String toString() {
		return this.nome + " - " + listaNinjas.size();
	}
	
}
