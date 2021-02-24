
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
			System.out.println("Voc� Sacou " + valor);
			System.out.println("Seu saldo � de " + this.saldo);
			return true;
		} else {
			System.out.println(
					"Voc� n�o tem Saldo Suficiente para o valor do seu saque, seu saldo atual � de " + this.saldo);
			return false;

		}
	}

	public boolean transfere(double valor, Conta destino) {

		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			System.out.println("Voc� transferiu " + valor + " reais ");
			return true;

		} else {
			System.out.println(
					"Voc� n�o tem Saldo Suficiente para fazer esta transfer�ncia, seu saldo � de: " + this.saldo);
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
			System.out.println("Voc� n�o pode Cadastrar n�mero menor que 0");
			return;
		}
		this.numero = numero;

	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Voc� n�o pode cadastrar n�mero <=0");
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