package apslivraria.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import apslivraria.model.dao.Autor;
import apslivraria.model.dao.Editora;
import apslivraria.model.dao.Livro;



public class Connection{
	//variaveis utilizada em todas as funções para abrir/fechar o banco 
	EntityManagerFactory factory = 
		      Persistence.createEntityManagerFactory("Livraria");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction et = null;
	
	//METODO PRECISA SER CHAMADO NO COMEÇO DO PROGRAMA, abre a conexão
	public SessionFactory getCurrentSessionFromJPA() {
		  Session session = manager.unwrap(org.hibernate.Session.class);
		  SessionFactory SeFactory = session.getSessionFactory();
		  return SeFactory;
		}
	
	//adiciona um objeto livro no banco de dados
	public void addLivro(Livro livro) {
		try {
			et = manager.getTransaction();
			et.begin();
			manager.persist(livro);
			et.commit();
		}catch(Exception e) {
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();
		}finally {
			manager.close();
		}
	}
	
	//adiciona um objeto editora no banco de dados.
	public void addEditora(Editora editora) {
		try {
			et = manager.getTransaction();
			et.begin();
			manager.persist(editora);
			et.commit();
		}catch(Exception e) {
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();
		}finally {
			manager.close();
		}
	}
	
	//adiciona um objeto autor no banco de dados
	public void addAutor(Autor autor) {
		try {
			et = manager.getTransaction();
			et.begin();
			manager.persist(autor);
			et.commit();
		}catch(Exception e) {
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();
		}finally {
			manager.close();
		}
	}
	
	//lista todos os livros
	@SuppressWarnings("unchecked")
	public List <Livro> findAllBooks() {
		manager.getTransaction().begin();
		Query q = manager.createQuery("SELECT livro FROM Livro livro");
		List<Livro> livros = q.getResultList();
		manager.getTransaction();
		manager.close();
        return livros;
	}
	
	@SuppressWarnings("unchecked")
	public List <Autor> findAllAuthors() {
		manager.getTransaction().begin();
		Query q = manager.createQuery("SELECT autor FROM Autor autor");
		List<Autor> autores = q.getResultList();
		manager.getTransaction();
		manager.close();
        return autores;
	}
	
	@SuppressWarnings("unchecked")
	public List <Editora> findAllPublishers() {
		manager.getTransaction().begin();
		Query q = manager.createQuery("SELECT editora FROM Editora editora");
		List<Editora> editoras = q.getResultList();
		manager.getTransaction();
		manager.close();
        return editoras;
	}
	
	public Livro getLivroById(final String id) {
        return manager.find(Livro.class, id);
    }
	
	public Autor getAutorById(final long id) {
		return manager.find(Autor.class, id);
	}
	
	public Editora getEditoraById(final long id) {
        return manager.find(Editora.class, id);
    }
	
	//muda algumas informações de um objeto livro ja existente
	public void updateLivro(String isbn, String titulo, float preco) {
		Livro livro = null;
		try {
			et = manager.getTransaction();
			et.begin();
			livro = manager.find(Livro.class, isbn);
			livro.setPreco(preco);
			livro.setTitulo(titulo);
			manager.persist(livro);
			et.commit();
		}catch(Exception e) {
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();
		}finally {
			manager.close();
		}
	}
	
	public void updateAutor(long id, String nome, String sobrenome) {
		Autor autor = null;
		try {
			et = manager.getTransaction();
			et.begin();
			autor = manager.find(Autor.class, id);
			autor.setNome(nome);
			autor.setSobrenome(sobrenome);
			manager.persist(autor);
			et.commit();
		}catch(Exception e) {
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();
		}finally {
			manager.close();
		}
	}
	
	public void updateEditora(long id, String nome, String site) {
		Editora editora = null;
		try {
			et = manager.getTransaction();
			et.begin();
			editora = manager.find(Editora.class, id);
			editora.setNome(nome);
			editora.setSite(site);
			manager.persist(editora);
			et.commit();
		}catch(Exception e) {
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();
		}finally {
			manager.close();
		}
	}
	
	//deleta um objeto livro do banco de dados
	public void deleteLivro(String isbn) {
		Livro livro = null;
		try {
			et = manager.getTransaction();
			et.begin();
			livro = manager.find(Livro.class, isbn);
			manager.remove(livro);
			manager.persist(livro);
			et.commit();
		}catch(Exception e) {
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();
		}finally {
			manager.close();
		}
	}
	
	public void deleteAutor(long id) {
		Autor autor = null;
		try {
			et = manager.getTransaction();
			et.begin();
			autor = manager.find(Autor.class, id);
			manager.remove(autor);
			manager.persist(autor);
			et.commit();
		}catch(Exception e) {
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();
		}finally {
			manager.close();
		}
	}
	
	public void deleteEditora(long id) {
		Editora editora = null;
		try {
			et = manager.getTransaction();
			et.begin();
			editora = manager.find(Editora.class, id);
			manager.remove(editora);
			manager.persist(editora);
			et.commit();
		}catch(Exception e) {
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();
		}finally {
			manager.close();
		}
	}
}

