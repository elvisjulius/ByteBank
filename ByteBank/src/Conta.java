
public class Conta {

	double saldo;
	int agencia;
	int numero;
	String titular;

	public void deposita(double valor) {
		this.saldo += valor;

	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Voc� Sacou " + valor);
			System.out.println("Seu saldo � de " + this.saldo);
			return true;
		} else {
			System.out.println(
					"Voc� n�o tem Saldo Suficiente para o valor do seu saque, seu saldo atual � de " + this.saldo);
			return false;

		}
	}
}