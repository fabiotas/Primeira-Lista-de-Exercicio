package br.com.exercicio.lista;

import java.util.Date;

public class Empregados {
		
	/**
	 * Essa classe ira reprensentar a classe empregados, não tem parametro 
	 * de entrada
	 * 
	 * @author Fabio Tavares
	 */
	int numMatricula;
	String nomefunc, funcao, dataAdmissao;
	double salario;
	
	
	public static void main(String[] args) {
		/**
		 * Na classe main é apenas instânciado o objeto e inserido os valores
		 * no mesmo.
		 */
	
		Empregados empregado = new Empregados();
		
		empregado.nomefunc = "Bart Simpson";
		empregado.funcao = "Consultor";
		
		
	}

}
