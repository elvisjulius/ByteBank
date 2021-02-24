
public class TestaGeteSet {

	public static void main(String[] args) {
		Conta conta = new Conta(3181,6222);
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		Cliente elvis = new Cliente();
	conta.setTitular(elvis);
elvis.setNome("Elvis Julius");
conta.setTitular(elvis);
	
System.out.println(conta.getTitular().getNome());
conta.getTitular().setProfissao("Programador");
System.out.println(conta.getTitular().getProfissao());
	}

}
