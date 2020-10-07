package apslivraria.model;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "livro")
public class Livro {
	@Id
	private long isbn;
	@Column(name = "nome")
	private String nome;
	@Column(name = "preco")
	private float preco;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Editora editora;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List <Autor> autores;
	
	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) { 
		this.autores = autores;
	}

	public Livro() {}
	
	public Livro(long isbn, String nome, float preco, Editora editora) {
		this.isbn = isbn;
		this.nome = nome;
		this.preco = preco;
//		this.autores = autores;
		this.editora = editora;
	}
	
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}

}
