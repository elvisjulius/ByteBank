
public class TesteSacaValoresNegativos {

	public static void main(String[] args) {
		Conta contaDaEvelin= new Conta ();
		contaDaEvelin.deposita(100);
		contaDaEvelin.saca(200);
		System.out.println(contaDaEvelin.getSaldo());
		
		contaDaEvelin.saca(1010);
		System.out.println(contaDaEvelin.getSaldo());
	}

}
