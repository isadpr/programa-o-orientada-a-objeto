package lista3_exercicio2;

public class ContaBancaria {
	private double saldo;
	private Data dataAbertura = new Data();
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Data getDataAbertura() {
		return this.dataAbertura;
	}
	
	public void setDataAbertura(int dia, int mes, int ano) {
		this.dataAbertura.setDia(dia);
		this.dataAbertura.setMes(mes);
		this.dataAbertura.setAno(ano);
	}
	
	public String getDataAberturaFormatada() {
		String diaFormatado = Integer.toString(dataAbertura.getDia()); //int --> string
		String mesFormatado = Integer.toString(dataAbertura.getMes()); //string --> int Integer.parseInt(String s)
		String anoFormatado = Integer.toString(dataAbertura.getAno());
		
		return diaFormatado + "/" + mesFormatado + "/" + anoFormatado;
	}
	
	public String getSaldoFormatado() {
		String saldoFormatado = Double.toString(getSaldo());
		
		return "R$" + saldoFormatado; 
	}
	
	public void depositar(double valorDepositado) {
		this.saldo += valorDepositado;
		System.out.println ("Saldo atual: " + getSaldoFormatado());
	}
	
	public void sacar(double valorSacado) {
		if(valorSacado > this.saldo) {
			System.out.println("Saldo insuficiente, nao foi possivel realizar o saque");
		}
		else {
			this.saldo -= valorSacado;
			System.out.println("Saldo atual: " + getSaldoFormatado());
		}
		
	}
}
