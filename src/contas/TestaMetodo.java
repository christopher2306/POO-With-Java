package contas;

public class TestaMetodo {

	
	public static void main(String[] args) {
		
		Conta contaChris = new Conta();
		
		System.out.println("-----------DEPOSITA-----------");
		contaChris.saldo = 150;
		System.out.println("O seu saldo é: " + contaChris.saldo);
		
		contaChris.deposita(400);
		System.out.println("O novo saldo é: " + contaChris.saldo);
		
		System.out.println("\n\n\n-----------SACA-----------");
		contaChris.saca(600);
		System.out.println("O novo saldo é: " + contaChris.saldo);
		
		System.out.println("\n\n\n-----------TRANSFERE-----------");
		Conta contaMaria = new Conta();
		contaMaria.saldo = 400;
		
		System.out.println("Saldo Maria: " + contaMaria.saldo);	
		System.out.println("Saldo Chris: " + contaChris.saldo);
		
		contaMaria.transfere(200, contaChris);
		
		System.out.println("Saldo Maria: " + contaMaria.saldo);	
		System.out.println("Saldo Chris: " + contaChris.saldo);	
	}
	
}
