package git;

public class CuentaBancaria {
	private String iban;
	private double saldo;
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public CuentaBancaria() {
		super();
	}
	@Override
	public String toString() {
		return "cuentaBancaria [iban=" + iban + ", saldo=" + saldo + "]";
	}
}
