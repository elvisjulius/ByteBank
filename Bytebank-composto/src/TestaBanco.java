
public class TestaBanco {

	public static void main(String[] args) {
		Cliente elvis = new Cliente();
		elvis.nome = "Elvis Julius";
		elvis.cpf = "222.222.222-22";
		elvis.profissao = "Programador";

		Conta contaDoElvis = new Conta();
		contaDoElvis.deposita(100);
		contaDoElvis.titular = elvis;
		System.out.println(contaDoElvis.titular.nome);
		System.out.println(contaDoElvis.titular.cpf);
		System.out.println(contaDoElvis.titular.profissao);
		
		System.out.println(contaDoElvis.titular);
		System.out.println(elvis);
	}

}
