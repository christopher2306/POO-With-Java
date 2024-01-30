package cliente;

import contas.Conta;

public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente christopher = new Cliente();
		christopher.nome = "Christopher";
		christopher.CPF = "12345678900";
		christopher.profissao = "analista";
		
		Conta contaChristopher = new Conta();
		contaChristopher.numero = 12345;
		contaChristopher.deposita(300);
		
		contaChristopher.titular = christopher;
		
		System.out.println("Nome: " + contaChristopher.titular.nome);
		System.out.println("Agencia: " + contaChristopher.agencia);
		System.out.println("Nome: " + contaChristopher.numero);

	}
	
}
