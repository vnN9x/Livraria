package apslivraria;

import java.lang.ModuleLayer.Controller;
import java.util.List;

import apslivraria.model.Connection;
import apslivraria.model.dao.Autor;
import apslivraria.model.dao.Editora;
import apslivraria.model.dao.Livro;

public class apslivrariaApplication{
	Controller ctrl;

	public static void main(String[] args) {
		new Connection();
//		Connection.getCurrentSessionFromJPA();
//		Livro livro = new Livro("777666", "O Alquimista", 70);
//		Connection.addLivro(livro);
//		Connection.addEditora(edit);
//		Connection.addAutor(autor2);
//		Connection.addAutor(autor);
//		List <Livro> livros = Connection.findAllBooks();
//		for (int i = 0; i < livros.size(); i++) {
//			System.out.println(livros.get(i).getIsbn() +"\n"+ livros.get(i).getNome() +"\n"+ livros.get(i).getPreco());
//		}

	}
}