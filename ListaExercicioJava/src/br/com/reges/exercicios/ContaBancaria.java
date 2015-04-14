package br.com.reges.exercicios;

/**
 * Nesta classe será feito o exercicio da Conta Bancaria,
 * Logo a baixo está a classe principal, com os seguintes atributos:
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
	 * nome que será String
	 * contaBancaria que será String, pois pensei colocar mascará para armazenar apenas os numeros mais não achei material por em quanto.
	 * valorConta que será double
	 * 
	 */
	String nome;
	String contaBancaria;
	double valorConta;
	
	/**
	 * Criei o metodo de para Consulta fiz pensando em no sistema futuro
	 * acredito que será bastante usado.
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
		Conta.nome = "Fábio Tavares Santana";
		Conta.contaBancaria = "291.102323-3";
		Conta.valorConta = 19000.00;
		
		/**
		 * Fiz a chamada do metodo ConsultarConta
		 */
		
		Conta.ConsultaConta();
		
		
		
	}
	
	
}
