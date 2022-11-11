package p1_2016;

public class Utils {
	public int[] trueFalse (boolean[] binario) {
		int[] novoArray = new int[5];
		
		for(int i=0; i<binario.length; i++ ) {
			if(binario[i] == false) {
				novoArray[i] = 0;
			}
			else {
				novoArray[i] = 1;
			}
			System.out.println(novoArray[i]);
		}
		
		return novoArray;
	}
	
	public static void main (String[] args) {
		boolean[] binario = new boolean[5];
		binario[0] = true;
		binario[1] = false;
		binario[2] = true;
		binario[3] = false;
		binario[4] = true;
		
		Utils arrayBinario = new Utils();
		arrayBinario.trueFalse(binario);
		
	}
}
