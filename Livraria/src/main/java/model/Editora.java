package model;

public class Editora {

	private Long idEditora;
	private String nome;
	private String email;

	public Long getIdEditora() {
		return idEditora;
	}

	public void setIdEditora(Long idEditora) {
		this.idEditora = idEditora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "Editora [idEditora=" + idEditora + ", nome=" + nome + ", email=" + email + "]";
	}

}
