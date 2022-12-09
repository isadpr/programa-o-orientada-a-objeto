package lista09;

import java.util.ArrayList;
import java.util.List;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		Aluno a = new Aluno("123");
		Aluno b = new Aluno("456");
		Aluno c = new Aluno("789");
		
		a.setNome("José");
		b.setNome("Maria");
		c.setNome("João");
		
		List<Aluno> x = new ArrayList<Aluno>();
		
		x.add(a);
		x.add(b);
		x.add(c);
		
		Utils.ordena(x);
		
	}
}
