package br.com.exercicio.lista;

import java.util.Date;

public class Empregados {
		
	/**
	 * Essa classe ira reprensentar a classe empregados, n�o tem parametro 
	 * de entrada
	 * 
	 * @author Fabio Tavares
	 */
	int numMatricula;
	String nomefunc, funcao, dataAdmissao;
	double salario;
	
	
	public static void main(String[] args) {
		/**
		 * Na classe main � apenas inst�nciado o objeto e inserido os valores
		 * no mesmo.
		 */
	
		Empregados empregado = new Empregados();
		
		empregado.nomefunc = "Bart Simpson";
		empregado.funcao = "Consultor";
		
		
	}

}
