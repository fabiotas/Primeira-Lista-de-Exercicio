package br.com.reges.exercicios;
/**
 * Esta Classe ira ser Criado um objeto 
 * lampada com os metodos de Acender a lampada e Apagar
 * 
 * @author Tavares
 *
 */
public class ExercLampada {
	/**
	 * Este é o metodo de acender a lampada.
	 */
	private void acender(){
		System.out.println("Lampada Acesa");
	}
	
	/**
	 * Este é o metodo de apagar a lampada.
	 */
	private void apagarLampada(){
		System.out.println("Lampada Apagada");
	}
	
	
	/**
	 * Este é o metodo principal main onde será chamado os metodos
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Esta sendo criado o objeto lampada.
		 */
		ExercLampada lampada = new ExercLampada();
		
		
		/**
		 * Logo a baixo será chamado os metodo apagar e acender a lampada.
		 */
		lampada.acender();
		lampada.apagarLampada();
		
	}

}
