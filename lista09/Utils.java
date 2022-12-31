package lista09;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Utils {
	public static boolean exite (List<Aluno> x, Aluno y) {
		if (x.contains(y)) {
			return true;
		}
		return false;
	}
	
	public static void ordena(List<Aluno> x) {
		Collections.sort(x);
		
		System.out.println(x);
	}
	
	public Map<String, Aluno> retornaDados(Set conjuntoAlunos){
		Map<String, Aluno> alunos = new HashMap<String, Aluno>();
		Iterator it= conjuntoAlunos.iterator();
		
		while(it.hasNext()) {
			String aluno = (String)it.next();
			String[] s = aluno.split("#");
			
			if(s[3].equals("R")) {
				Aluno a1 = new AlunoRegular(s[0]);
				a1.setNome(s[1]);
				a1.setNota(Double.parseDouble(s[2]));
				alunos.put(s[0], a1);
			}
			else if(s[3].equals("E")) {
				Aluno a2 = new AlunoEspecial(s[0]);
				a2.setNome(s[1]);
				a2.setNota(Double.parseDouble(s[2]));
				alunos.put(s[0], a2);
			}
			else {
				throw new RuntimeException();
			}
		}
		
		return alunos;
	}
}
