package contas;

public class TesteGettersESetters {
	public static void main(String[] args) {
		
		Conta conta3 = new Conta();
		
		conta3.setNumero(11231);
		conta3.deposita(200);
		conta3.setAgencia(0104);
		
		System.out.println("Exibindo numero: " + conta3.getNumero());
		System.out.println("Exibindo agencia: " + conta3.getAgencia());
		System.out.println("Exibindo saldo: " + conta3.getSaldo());
	}
}
