package aulaDia16;

public class TesteConta {
	public static void main (String[] args) {
		double val = 1000;
		Conta c = new Conta();
		
		try {
			c.sacar(val);
			CaixaEletronico.liberaValor(val);
			System.out.println(c.getSaldo());
		} 
		catch (SDException e) {
			System.out.println("propaganda de emprestimo");
			System.out.println("mensagem da exception: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("FIM");	
	}
}
