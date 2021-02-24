
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoElvis = new Conta();
		contaDoElvis.saldo = 100;
		contaDoElvis.deposita(50);
		System.out.println(contaDoElvis.saldo);

		boolean conseguiuRetirar = contaDoElvis.saca(50);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaStefany = new Conta();
		contaDaStefany.deposita(1000);
		
		contaDaStefany.transfere(300, contaDoElvis);
		System.out.println(contaDaStefany.saldo);
		System.out.println(contaDoElvis.saldo);
	}

}
