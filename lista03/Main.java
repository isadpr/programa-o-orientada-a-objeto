package lista3_exercicio2;

public class Main {
	public static void main (String[] args) {
		ContaBancaria conta1 = new ContaBancaria();
		conta1.setDataAbertura(19,10,2022);
		conta1.setSaldo(1000);
		System.out.println(conta1.getDataAberturaFormatada());
		System.out.println(conta1.getSaldoFormatado());
		conta1.depositar(500);
		conta1.sacar(350);
	}
}
