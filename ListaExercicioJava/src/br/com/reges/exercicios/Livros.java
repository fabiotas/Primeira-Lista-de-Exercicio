package br.com.exercicio.lista;

public class Livros {

	/**
	 * Essa classe � uma classe para reprentar livros de uma biblioteca
	 * 
	 * @author F�bio Tavares
	 */
	int codLivro, codBarras, quantidade;
	String nomeLivro, autor, editora, anoPublicacao, se��o, prateleira;
	
	public static void main(String[] args) {
		
		/**
		 * Na classe main � criado o objeto livro e inserido valores nos atributos.
		 */
		Livros livro = new Livros();
		
		livro.nomeLivro = "Aula Java";
		livro.editora = "Person";
		livro.quantidade = 13;
		livro.codBarras = 384211205;
		
	}
	
}
