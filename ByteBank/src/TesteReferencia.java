
public class TesteReferencia {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Saldo da Primeira Conta é : " + primeiraConta.saldo);

		Conta segundaConta = primeiraConta;
		System.out.println("O saldo da Segunda Conta é : " + segundaConta.saldo);
		System.out.println(primeiraConta);
		System.out.println(segundaConta);

		//Foi adicionado através da atribuição da segunda Conta mais 100 ao valor de saldo da segunda conta, porém o valor//
		//também acaba sendo adicionado ao saldo da primeira conta porque ele se trata do mesmo objeto conta "Conta@73a28541"//
		segundaConta.saldo += 100;
		System.out.println("O saldo da Segunda Conta é : " + segundaConta.saldo);

		System.out.println("Saldo da Primeira Conta é : " + primeiraConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("São a mesma conta");
		} else { System.out.println("São contas diferentes");

		}
	}

}
