
public class CriaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		System.out.println("Na Primeira conta tem " + primeiraConta.saldo + " reais");
		System.out.println("Na Segunda conta tem " + segundaConta.saldo + " reais");
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		System.out.println(segundaConta.agencia);
		
		segundaConta.agencia = 3181;
		
		System.out.println("A segunda conta agora é da agência  " + segundaConta.agencia );
		
		if (primeiraConta == segundaConta) {
			System.out.println("São a mesma conta");
		} else { System.out.println("São contas diferentes");
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);

		}
	}
}
