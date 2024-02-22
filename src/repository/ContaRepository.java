package repository;

import conta.model.conta;

public interface ContaRepository {

	public void procurarPorNumero(int numero);
	public void listarTodas();
	public void cadastrar (conta contaBancaria);
	public void atualizar (conta contaBancaria);
	public void deletar (int numero);
	
	//Métodos Bancarios
	public void sacar(int numero, float valor);
	public void depositar(int numero, float valor);
	public void transferir(int numeroOrigem, int numeroDestino, float valor);
	
		
}
