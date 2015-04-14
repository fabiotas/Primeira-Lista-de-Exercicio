package br.com.reges.exercicios;

/**
 *  importei a biblioteca JOptionPane para receber dados do usuario.
 */
import javax.swing.JOptionPane;


/**
 * Classe principal AgendaPessoal que terá as seguintes variaveis: nome, endereço, numTelefone, Email.
 * e os seguintes metodos:  
 * 
 * @author Tavares
 *
 */
public class AgendaPessoal {

	String nome;
	String endereco;
	String numTelefone;
	String Email;
	
	private void ReceberDados(){
		
		int resp;
		boolean exit;
		
		
		exit = false;
		while(!exit){
		nome = JOptionPane.showInputDialog("Qual o é o nome do Contato? ");
		endereco = JOptionPane.showInputDialog("Qual é o endereço do Contato?");
		numTelefone = JOptionPane.showInputDialog("Qual é o Telefone do Contato?");
		Email = JOptionPane.showInputDialog("Qual é o email do Contato?");
		
		resp = JOptionPane.showConfirmDialog(null, "Deseja Confirmar contato ?");
		if(resp == JOptionPane.YES_OPTION){
			JOptionPane.showMessageDialog(null,"Contato Salvo.");
			exit = true;
		}else{
			exit = false;
		}
			
	  }
	
	}
	public void MostrarContato(){
		
		
	}
	
	public static void main(String[] args) {
		
		int opc;
		String StringInput;
		
		AgendaPessoal Agenda = new AgendaPessoal();
		
		StringInput = JOptionPane.showInputDialog("Bem vindo a Agenda Java ! \n1 - Cadastrar\n2 - Consultar");
		opc = Integer.parseInt(StringInput);
		
		if(opc == 1){
			Agenda.ReceberDados();
		}else{
			if(Agenda.nome == null){
				JOptionPane.showMessageDialog(null,"Não existe Contato.\nFavor Cadastrar Contato.");
			}else{			
				Agenda.MostrarContato();
			}
		}
		
	}
}