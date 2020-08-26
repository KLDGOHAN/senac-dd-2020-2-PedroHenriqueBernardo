package model.vo;

import java.util.List;

public class Cliente {

	private int id;
	private String nome;
	private String cpf;
	private Endereco endereco;
	private List<Telefone> teleones;

	public Cliente(int id, String nome, String cpf, Endereco endereco, List<Telefone> teleones) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.teleones = teleones;
	}

	public Cliente() {
		
	}

	@Override

	public String toString() {

		String numerosTelefones = "";

		for (Telefone tel : this.getTeleones()) {
			numerosTelefones += "(" + tel.getDdd() + ") " + tel.getNumero() + "\n";
		}

		return "Cliente: "+ this.nome +" (" +this.cpf+ ")\n"
						+"Endereço: " + this.getEndereco().toString()+ "\n"
						+"Quantidade de telefones que possui: "+ this.getTeleones().size()+"\n"
						+"Número(s) de telefone(s): "+ numerosTelefones;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Telefone> getTeleones() {
		return teleones;
	}

	public void setTeleones(List<Telefone> teleones) {
		this.teleones = teleones;
	}

}
