package br.com.reges.exercicios;

/**
 * Nesta classe ser� feito o exercicio da Conta Bancaria,
 * Logo a baixo est� a classe principal, com os seguintes atributos:
 * 
 * nome
 * contaBancaria
 * valor
 * 
 * @author Tavares
 *
 */

public class ContaBancaria {

	/**
	 * Variaveis 
	 * 
	 * nome que ser� String
	 * contaBancaria que ser� String, pois pensei colocar mascar� para armazenar apenas os numeros mais n�o achei material por em quanto.
	 * valorConta que ser� double
	 * 
	 */
	String nome;
	String contaBancaria;
	double valorConta;
	
	/**
	 * Criei o metodo de para Consulta fiz pensando em no sistema futuro
	 * acredito que ser� bastante usado.
	 * 
	 */
	public void ConsultaConta(){
		
		System.out.println("Nome do Usuario: "+nome+"\n"+"Conta: "+ contaBancaria +"\n"+"Valor total: R$"+valorConta);
	}
	
	public static void main(String[] args) {
		
		/**
		 *  logo a baixo criei o objeto Conta
		 */
		ContaBancaria Conta = new ContaBancaria();
		/**
		 * Atribui os valores nas variaveis.
		 */
		Conta.nome = "F�bio Tavares Santana";
		Conta.contaBancaria = "291.102323-3";
		Conta.valorConta = 19000.00;
		
		/**
		 * Fiz a chamada do metodo ConsultarConta
		 */
		
		Conta.ConsultaConta();
		
		
		
	}
	
	
}
