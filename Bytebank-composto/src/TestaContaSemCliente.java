
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDaStefany = new Conta();
		contaDaStefany.titular = new Cliente();
		
		System.out.println(contaDaStefany.titular);
		
		contaDaStefany.titular.nome = "Stefany Cristina";
		System.out.println(contaDaStefany.titular.nome);

	}

}
