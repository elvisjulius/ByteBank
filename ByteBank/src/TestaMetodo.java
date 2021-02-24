
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoElvis = new Conta();
		contaDoElvis.saldo = 100;
		contaDoElvis.deposita(50);
System.out.println(contaDoElvis.saldo);
	}

}	
