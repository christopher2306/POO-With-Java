package contas;

public class CriaConta {
	
	public static void main(String[] args) {
		
		//Criando uma conta real a partir da classe "Conta"
		Conta conta1 = new Conta();
			//conta1.numero = 23100;
			conta1.deposita(200.50);
			//conta1.titular.nome = "José Augusto";
			
		Conta conta2 = new Conta();
			//conta2.numero = 23200;
			conta2.deposita(300.23);
			//conta2.titular.nome = "Maria Joana";
			
			System.out.println("Dados conta1:");
			System.out.println("Agencia: " + conta1.getAgencia());
			System.out.println("Numero: " + conta1.getNumero());
			System.out.println("Saldo: " + conta1.getSaldo());
			//System.out.println("Titular " + conta1.titular.nome);
			
			System.out.println("\n\nDados conta2:");
			System.out.println("Agencia: " + conta2.getAgencia());
			System.out.println("Numero: " + conta2.getNumero());
			System.out.println("Saldo: " + conta2.getSaldo());
			//System.out.println("Titular " + conta2.titular.nome);
		
	}
}
