package br.com.exercicio.lista;

public class Passageiros {
	
	/**
	 * Esta classe representa os passageiros em uma empresa de aviação e 
	 * não possui parametros de entrada.
	 * 
	 * @author Fabio Tavares
	 */
	
	int codPassageiro, nroVoo;
	boolean necessidadeEspecial;
	String dtNascimento, paisOrigem, estadoOrigem, cidadeOrig
		 , paisDest, estadoDest, cidadeDest, acento;
	
	/**
	 * a classe passageiros possui o metodo main apenas para teste
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * no metodo main é instânciado o objeto passag para inserção de valores.
		 * 
		 */
		Passageiros passag = new Passageiros();
		
		passag.codPassageiro = 654;
		passag.necessidadeEspecial = false;
		passag.acento = "A54";
		passag.nroVoo = 1447;
	}

}
