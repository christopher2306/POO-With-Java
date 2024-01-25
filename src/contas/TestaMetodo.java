package contas;

public class TestaMetodo {

	
	public static void main(String[] args) {
		
		Conta contaChris = new Conta();
		
		contaChris.saldo = 150;
		System.out.println("O seu saldo é: " + contaChris.saldo);
		
		contaChris.deposita(400);
		System.out.println("O novo saldo é: " + contaChris.saldo);
	}
	
}
