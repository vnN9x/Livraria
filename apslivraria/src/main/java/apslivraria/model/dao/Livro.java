package apslivraria.model.dao;
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
	private String isbn;
	@Column(name = "titulo")
	private String titulo;
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
	
	public Livro(String isbn, String titulo, float preco) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.preco = preco;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}

}
