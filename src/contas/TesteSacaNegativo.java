package contas;

public class TesteSacaNegativo {
	public static void main(String[] args) {
		
		Conta contaDoCiclano = new Conta();
		contaDoCiclano.deposita(100);
		contaDoCiclano.saca(200);
		System.out.println("Saldo da conta: " + contaDoCiclano.getSaldo());
		
		//algo que não se pode fazer
		//contaDoCiclano.saldo = contaDoCiclano.saldo - 200;
		System.out.println("Saldo da conta: " + contaDoCiclano.getSaldo());

	}
}
