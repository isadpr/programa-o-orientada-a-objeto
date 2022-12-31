package lista09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		Aluno a = new Aluno("123");
		Aluno b = new Aluno("456");
		Aluno c = new Aluno("789");
		
		a.setNome("José");
		b.setNome("Maria");
		c.setNome("Amanda");
		
		List<Aluno> x = new ArrayList<Aluno>();
		x.add(a);
		x.add(b);
		x.add(c);
		
		Set<String> y = new HashSet<String>();
		y.add("154-3#Simba Silva#3.7#R");
		y.add("553-2#Juju Juba#10.0#E");
		y.add("256-1#José das Couves#8.4#F");
		System.out.println(y);
		
		Utils.ordena(x);
		
		//instanciar utils porque nao da para fazer uma referencia estatica a um metodo nao estatico
		Utils utils = new Utils();
		System.out.println(utils.retornaDados(y));

	}
}
