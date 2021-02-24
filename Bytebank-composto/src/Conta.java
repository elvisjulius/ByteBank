
public class Conta {

	double saldo;
	int agencia;
	int numero;
	Cliente titular;

	public void deposita(double valor) {
		this.saldo += valor;

	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Você Sacou " + valor);
			System.out.println("Seu saldo é de " + this.saldo);
			return true;
		} else {
			System.out.println(
					"Você não tem Saldo Suficiente para o valor do seu saque, seu saldo atual é de " + this.saldo);
			return false;

		}
	}

	public boolean transfere(double valor, Conta destino) {

		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			System.out.println("Você transferiu "+ valor + " reais ");
			return true;

		} else {
			System.out.println(
					"Você não tem Saldo Suficiente para fazer esta transferência, seu saldo é de: " + this.saldo);
			return false;

		}

	}
}