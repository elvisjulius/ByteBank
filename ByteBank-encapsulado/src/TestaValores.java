
public class TestaValores {

	public static void main(String[] args) {
		Conta elvis = new Conta(3181,6222);
		
		System.out.println(elvis.getAgencia());
		System.out.println(elvis.getNumero());
		
		Conta evelin = new Conta(3181,5222);
		Conta stefany = new Conta(3181,3222);
		
		System.out.println("O total de conta é "+ Conta.getTotal());
	}

}