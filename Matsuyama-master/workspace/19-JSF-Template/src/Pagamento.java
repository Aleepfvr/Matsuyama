

public class Pagamento {
	private String credito;
	private String debito;
	private String dinheiro;

	public String getCredito() {
		return credito;
	}

	public void setCredito(String credito) {
		this.credito = credito;
	}

	public String getDebito() {
		return debito;
	}

	public void setDebito(String debito) {
		this.debito = debito;
	}

	public String getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(String dinheiro) {
		this.dinheiro = dinheiro;
	}

	public Pagamento() {
		super();
	}

	public Pagamento(String credito, String debito, String dinheiro) {
		super();
		this.credito = credito;
		this.debito = debito;
		this.dinheiro = dinheiro;
	}

}
