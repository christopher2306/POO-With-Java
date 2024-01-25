package contas;

public class TestaReferencia {

	public static void main(String[] args) {
		
		//instanciando a variavel para um novo objeto que foi criado a partir de new
		Conta primeiraConta = new Conta();
		//referencia
		primeiraConta.saldo = 200.43;
		
		System.out.println("O valor da primeira conta é: " + primeiraConta.saldo);
		
		//referenciando a segundaConta para a primeiraConta
		//Duas variaveis que apontam ao mesmo objeto
		Conta segundaConta = primeiraConta;
		
		System.out.println("O valor da primeira conta é: " + segundaConta.saldo);
		
		//mesmo modificando o valor somente na segundaConta, as duas irão se modificar, pois é o mesmo objeto
		segundaConta.saldo = 300.00;
		System.out.println("O valor da primeira conta é: " + primeiraConta.saldo);
		System.out.println("O valor da primeira conta é: " + segundaConta.saldo);
		
		Conta terceiraConta = new Conta();
		
		//o caminho da primeira e segunda conta são iguais, pois é o mesmo objeto. A terceira conta possui caminho diferente, pois é outro objeto.
		System.out.println("Caminho primeiraConta: " + primeiraConta);
		System.out.println("Caminho segundaConta: " + segundaConta);
		System.out.println("Caminho terceiraConta: " + terceiraConta);
	}
	
}
