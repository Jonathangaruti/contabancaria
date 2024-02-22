package conta.model;

public class testeConta {

	
	public static void main(String[] args) {
		
		conta conta1 = new contaCorrente();
		
		conta1.setNumero(032);
		conta1.setAgencia(22);
		conta1.setTipo(1);
		conta1.setTitular("Jessica");
		conta1.setSaldo(10000);
	
		
		
		contaCorrente contaCorrente1 = new contaCorrente(15, 25, 1, "User1", 7000.0f, 3000.0f);
		
		
		System.out.println(contaCorrente1.getNumero());
		System.out.println(contaCorrente1.getAgencia());
		System.out.println(contaCorrente1.getTipo());
		System.out.println(contaCorrente1.getTitular());
		System.out.println(contaCorrente1.getSaldo());
		
		System.out.println("Saldo atual " + conta1.getSaldo());
		
		
		
		
		
		
		System.out.println("Saldo inicial: " + contaCorrente1.getSaldo());
		contaCorrente1.sacar(1500);
		System.out.println("Saldo pós saque: " + contaCorrente1.getSaldo());
	}
}
