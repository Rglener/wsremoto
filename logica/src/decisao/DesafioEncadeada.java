package decisao;

import javax.swing.JOptionPane;

public class DesafioEncadeada {

	public static void main(String[] args) {
		/*
		 * Acrescente uma captura de dado, perguntando ao usuario
		 * se é alfabetizado (1) ou não (0)
		 * Se ele não for alfabetizado não vota
		 * Altere o código abaixo para melhor estrutura de decisao		
		 */

		byte alfabetizado = Byte.parseByte(JOptionPane.showInputDialog("Digite <1> para alfabetizado"));
		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		if (alfabetizado==1) {
			short idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));		
			if (idade<16) {	
				System.out.println(nome + " você ainda não pode votar");			
			}
			if (idade>=18 && idade <=70)  {
				System.out.println(nome + " você não é obrigado a votar ");
			}else {
				System.out.println(nome + " o seu voto é facultativo");
			}
		}else {
			System.out.println(nome + " você não pode votar");
		}


		}

	}
