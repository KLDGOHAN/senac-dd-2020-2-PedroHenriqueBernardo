package model.vo;

public class Telefone {

	private int id;
	private String ddd;
	private	String numero;
	private	Cliente titularConta;
	private boolean movel;
	private String imei;
	
	public Telefone(int id, String ddd, String numero, Cliente titularConta, boolean movel, String imei) {
		super();
		this.id = id;
		this.ddd = ddd;
		this.numero = numero;
		this.titularConta = titularConta;
		this.movel = movel;
		this.imei = imei;
	}

	public Telefone() {

	}

	@Override
	public String toString() {
		return "Telefone [id=" +id+ ", ddd=" +ddd+ ", numero=" +numero+ ", titularConta"
						+ ", movel="+movel+ ", imei"+imei+"]";
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Cliente getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(Cliente titularConta) {
		this.titularConta = titularConta;
	}

	public boolean isMovel() {
		return movel;
	}

	public void setMovel(boolean movel) {
		this.movel = movel;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}
	
	
	
}

