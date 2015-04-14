package br.com.exercicio.lista;

public class Livros {

	/**
	 * Essa classe é uma classe para reprentar livros de uma biblioteca
	 * 
	 * @author Fábio Tavares
	 */
	int codLivro, codBarras, quantidade;
	String nomeLivro, autor, editora, anoPublicacao, seção, prateleira;
	
	public static void main(String[] args) {
		
		/**
		 * Na classe main é criado o objeto livro e inserido valores nos atributos.
		 */
		Livros livro = new Livros();
		
		livro.nomeLivro = "Aula Java";
		livro.editora = "Person";
		livro.quantidade = 13;
		livro.codBarras = 384211205;
		
	}
	
}
