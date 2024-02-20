package conta.model;

public class testeConta {

	
	public static void main(String[] args) {
		
		contaCorrente contaCorrente1 = new contaCorrente(15, 25, 1, "User1", 7000.0f, 3000.0f);
		
		System.out.println("Saldo inicial: " + contaCorrente1.getSaldo());
		contaCorrente1.sacar(1500);
		System.out.println("Saldo pós saque: " + contaCorrente1.getSaldo());
	}
}
