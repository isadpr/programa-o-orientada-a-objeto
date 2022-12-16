package aulaDia16;

public class Conta {
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void sacar (double v) {
		if(v > saldo) {
			throw new SDException("saldo = " + saldo);	
		}
		else {
			saldo-=v;
		}
	}
}

/* try {
 * 	insereNoBD();
 * } catch (InsercaoException e) {
 * 	log(e);
 * } finally {
 * 	fecharConexaoBD();
 * }
 */
