package contas;

//A classe é o esqueleto de um objeto.
//Um Objeto é criado a partir de uma classe, passando valores para os campos da classe (pode ser criado infinitos objetos a partir de uma única classe).
//Método são ações que partem dos objetos.
//A conta deve conter: Saldo, agencia, numero e titular.
public class Conta {
	
	double saldo;
	int agencia = 0101;
	int numero;
	String titular;
	
//Um método "void" é aquele que executa ação sem a necessidade de retornar algo.	
//O "this" informa o saldo é da classe.
	public void deposita(double valor){
		this.saldo = this.saldo + valor;
	}
	
}
