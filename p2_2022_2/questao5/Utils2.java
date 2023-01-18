package p2_2022_2;

import java.util.Set;

public class Utils2 {
	public static void verifica (String texto) throws TextoCurtoException {
		if(texto.length()<10) {
			throw new TextoCurtoException("texto iserido com " + texto.length() + "caracteres");
		}
	}
	
	public static String moderar (String texto) {
		Set palavrao = Utilidades.getPalavroes();
		String[] palavras = texto.split(" ");
		String result = "";

		for(int i=0; i<palavras.length; i++) {	
			if(palavrao.contains(palavras[i].toLowerCase())) {
				String palavraoHash = hashtag(palavras[i].length());
				result = result + " " + palavraoHash;
			}
			else {
				result = result + " " + palavras[i];
			}
		}
		
		return result;
	}
	
	private static String hashtag(int tamanhoPalavra) {
		String str = "";
		for(int i=0; i<tamanhoPalavra; i++) {
			str += "#";
		}
		return str;
	}
}
