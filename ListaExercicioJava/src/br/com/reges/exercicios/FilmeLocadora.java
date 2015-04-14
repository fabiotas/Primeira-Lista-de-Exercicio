package br.com.exercicio.lista;

public class FilmeLocadora {
	/**
	 * Esta classe ira representar Filmes de uma locadora, não tera parametros 
	 * nem um de entrada;
	 * 
	 * @author Fabio Tavares 
	 */
	int quantFilme, codFilme, codBarras, classificacao;
	String distribuidora,nomeFilme, sinopse, atores, genero, anoLancamento;
	float tempoDuracao;
	
	
	public static void main(String[] args) {
		
		/**
		 * Na classe main será criado o objeto filme onde será inserido os valores
		 * no objeto filme e logo abaixo será mostrado na tela os valores
		 */
		FilmeLocadora filme = new FilmeLocadora();
		
		filme.quantFilme = 3;
		filme.atores = "Goku";
		filme.nomeFilme = "Dragon Ball Z";
		
		System.out.println("O filme é: "+ filme.nomeFilme+"\nAtor principal: "+filme.atores+"\nQuantidade: "+filme.quantFilme);
	}
	
}
