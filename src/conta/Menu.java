package conta;

import conta.model.conta;

public class Menu {

	public static void main(String[] args) {
		
		conta c1 = new conta(1, 123, 1, "User", 800000.0f);
		
		
		c1.visualizar();
		
		
		if (c1.sacar(100))
		System.out.println("Saque efetuado com sucesso. O novo saldo é de: " + c1.getSaldo());
		else
			System.out.println("O Saldo é insuficiente!");
		
		c1.depositar(1000);
		System.out.println("O novo saldo é: " + c1.getSaldo());
		
	}
}
