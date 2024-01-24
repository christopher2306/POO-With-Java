package contas;

public class CriaConta {
	
	public static void main(String[] args) {
		
		//Criando uma conta real a partir da classe "Conta"
		Conta conta1 = new Conta();
			conta1.numero = 23100;
			conta1.saldo = 200.50;
			conta1.titular = "José Augusto";
			
		Conta conta2 = new Conta();
			conta2.numero = 23200;
			conta2.saldo = 300.23;
			conta2.titular = "Maria Joana";
			
			System.out.println("Dados conta1:");
			System.out.println("Agencia: " + conta1.agencia);
			System.out.println("Numero: " + conta1.numero);
			System.out.println("Saldo: " + conta1.saldo);
			System.out.println("Titular " + conta1.titular);
			
			System.out.println("\n\nDados conta2:");
			System.out.println("Agencia: " + conta2.agencia);
			System.out.println("Numero: " + conta2.numero);
			System.out.println("Saldo: " + conta2.saldo);
			System.out.println("Titular " + conta2.titular);
		
	}
}
