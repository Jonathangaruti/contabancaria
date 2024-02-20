package conta.model;

public class contaCorrente extends conta{

	private float limite;
	public contaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite; 
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public boolean sacar(float valor) {
		if(this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo insuficiente");
			return false;
		}
		this.setSaldo(this.getSaldo() - valor);
		System.out.println("\n valor sacado com sucesso!");
		return true;
	}
	
}
