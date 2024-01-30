package contas;

import cliente.Cliente;

//A classe é o esqueleto de um objeto.
//Um Objeto é criado a partir de uma classe, passando valores para os campos da classe (pode ser criado infinitos objetos a partir de uma única classe).
//Método são ações que partem dos objetos.
//A conta deve conter: Saldo, agencia, numero e titular.
public class Conta {
	
	public double saldo;
	public int agencia = 0101;
	public int numero;
	public Cliente titular;
	
//Um método "void" é aquele que executa ação sem a necessidade de retornar algo.	
//O "this" informa o saldo é da classe.
	
	
	public void deposita(double valor){
		this.saldo = this.saldo + valor;
	}
	
	
//boolean retorna true ou false	
	public boolean saca(double valor) {
		
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			System.out.println("Saque efetuado!");
			return true;
		} else {
			System.out.println("Erro na transação de saque!");
			return false;
		}
		
	}
	
	
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			System.out.println("Transferência realizada com sucesso.");
			return true;
		} else {
			System.out.println("Transferência negada.");
			return false;
		}
	}
}
