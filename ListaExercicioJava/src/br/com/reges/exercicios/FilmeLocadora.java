package br.com.exercicio.lista;

public class FilmeLocadora {
	/**
	 * Esta classe ira representar Filmes de uma locadora, n�o tera parametros 
	 * nem um de entrada;
	 * 
	 * @author Fabio Tavares 
	 */
	int quantFilme, codFilme, codBarras, classificacao;
	String distribuidora,nomeFilme, sinopse, atores, genero, anoLancamento;
	float tempoDuracao;
	
	
	public static void main(String[] args) {
		
		/**
		 * Na classe main ser� criado o objeto filme onde ser� inserido os valores
		 * no objeto filme e logo abaixo ser� mostrado na tela os valores
		 */
		FilmeLocadora filme = new FilmeLocadora();
		
		filme.quantFilme = 3;
		filme.atores = "Goku";
		filme.nomeFilme = "Dragon Ball Z";
		
		System.out.println("O filme �: "+ filme.nomeFilme+"\nAtor principal: "+filme.atores+"\nQuantidade: "+filme.quantFilme);
	}
	
}
