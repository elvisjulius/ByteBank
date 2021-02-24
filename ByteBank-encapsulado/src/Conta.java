
public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta "+ this.numero);
	}

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
			System.out.println("Você transferiu " + valor + " reais ");
			return true;

		} else {
			System.out.println(
					"Você não tem Saldo Suficiente para fazer esta transferência, seu saldo é de: " + this.saldo);
			return false;

		}

	}

	public double getSaldo() {
		return this.saldo;

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {

		if (numero <= 0) {
			System.out.println("Você não pode Cadastrar número menor que 0");
			return;
		}
		this.numero = numero;

	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Você não pode cadastrar número <=0");
			return;
		}

		this.agencia = agencia;

	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
}