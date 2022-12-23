package models;

public class Conta {
	private Integer numero;
	private String agencia;
	private String nomeCliente;
	private Double saldo;
	
	public Conta(Integer numero, String agencia, String nomeCliente, Double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}
	
	public Conta() {}
	
	public String getEmailMarketingCadastro() {
		return String.format("Ol� %s, obrigado por criar uma conta em nosso banco, "
				+ " sua ag�ncia � %s, conta %d e seu saldo de R$%.2f "
				+ "j� est� dispon�vel para saque",nomeCliente,agencia,numero,saldo);
	}
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
}
