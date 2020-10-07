package apslivraria;

import apslivraria.controller.Connection;
import apslivraria.model.Autor;
import apslivraria.model.Editora;
import apslivraria.model.Livro;

public class apslivrariaApplication {

	public static void main(String[] args) {
		new Connection();
		Connection.getCurrentSessionFromJPA();
		Autor autor = new Autor("Vinícius", "Maximiliano");
		Autor autor2 = new Autor("Cara", "Maluco");
//		List <Autor> autores;
//		autores.add(autor);
//		autores.add(autor2);
		Editora editora = new Editora("CasaVapo", "www.twitter.com/vhouse");
		Livro livro = new Livro(777, "Kvothe", 70, editora);
		Connection.addLivro(livro);
		
	}
}
