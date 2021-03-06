package model.vo;

public class Endereco {

	private int id;
	private String rua;
	private String numero;
	private String estado;
	private String cidade;
	
	
	public Endereco(int id, String rua, String numero, String estado, String cidade) {
		super();
		this.id = id;
		this.rua = rua;
		this.numero = numero;
		this.estado = estado;
		this.cidade = cidade;
	}


	public Endereco() {
		
	}
	
	
	@Override
	public String toString() {
		
		return "Endereco [id="+id+", rua="+rua+", numero="+numero+", estado="+estado
						+", cidade="+cidade+"]";		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
}
