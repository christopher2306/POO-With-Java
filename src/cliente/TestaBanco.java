package cliente;

import contas.Conta;

public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente christopher = new Cliente();
		christopher.nome = "Christopher";
		christopher.CPF = "12345678900";
		christopher.profissao = "analista";
		
		Conta contaChristopher = new Conta();
		contaChristopher.deposita(300);
		
	}
	
}
