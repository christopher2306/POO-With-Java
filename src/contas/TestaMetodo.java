package contas;

public class TestaMetodo {

	
	public static void main(String[] args) {
		
		Conta contaChris = new Conta();
		
		System.out.println("-----------DEPOSITA-----------");
		contaChris.deposita(200);
		System.out.println("O seu saldo é: " + contaChris.getSaldo());
		
		contaChris.deposita(400);
		System.out.println("O novo saldo é: " + contaChris.getSaldo());
		
		System.out.println("\n\n\n-----------SACA-----------");
		contaChris.saca(600);
		System.out.println("O novo saldo é: " + contaChris.getSaldo());
		
		System.out.println("\n\n\n-----------TRANSFERE-----------");
		Conta contaMaria = new Conta();
		contaMaria.deposita(400);
		
		System.out.println("Saldo Maria: " + contaChris.getSaldo());	
		System.out.println("Saldo Chris: " + contaChris.getSaldo());
		
		contaMaria.transfere(200, contaChris);
		
		System.out.println("Saldo Maria: " + contaChris.getSaldo());	
		System.out.println("Saldo Chris: " + contaChris.getSaldo());	
			
	}
	
}
