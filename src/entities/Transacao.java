package entities;

// é necessário utilizar getters and setters para poder chamar os atributos (ex: transacao.getConta();

public class Transacao {
	private int conta;
	private String nome;
	private double balance;
	public static final double TAXA = 5.00; // taxa para cada saque
	
	public Transacao(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}
	
	public Transacao(int conta, String nome, double initialDeposit) {
		this.conta = conta;
		this.nome = nome;
		amountToAdd(initialDeposit);
		
	}

	public int getConta() {
		return conta;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAmount() {
		return balance;
	}

	public void amountToAdd(double deposit) {
		balance += deposit;
	}
	
	public void amountToRemove(double saque) {
		balance -= saque + TAXA;
	}
	
	public String toString() {
		return "Conta: " 
					+ conta
					+ ", Titular: "
					+ nome
					+ ", Saldo: R$ "
					+ String.format("%.2f",balance);
	}
	
	
	
	
}
