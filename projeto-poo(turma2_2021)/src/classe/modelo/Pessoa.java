package classe.modelo;

public class Pessoa {
	
	private String nome;
	private int idade;
	private long celular;
	private String email;
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, int idade, long celular, String email) {
		this.nome = nome;
		this.idade = idade;
		this.celular = celular;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getCelular() {
		return celular;
	}
	public void setCelular(long celular) {
		this.celular = celular;
	}
	
}
