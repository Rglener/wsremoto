package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Digite um email").toLowerCase();
		while (email.contains("@")==false) {
			email = JOptionPane.showInputDialog("Digite o email com @").toLowerCase();
		}
		
		// pedi um nome, e só vão aceitar nomes com mais que 5 caracteres e menos que 10
		String nome = JOptionPane.showInputDialog("digite o nome");
		while (nome.length() <=5 || nome.length() >10) {
			nome = JOptionPane.showInputDialog("Digite o nome novamente").toUpperCase();			
		}
		
		System.out.println("Nome> " + nome);
		System.out.println("Email: " + nome);

	}

}
