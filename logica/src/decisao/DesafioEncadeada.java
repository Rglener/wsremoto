package decisao;

import javax.swing.JOptionPane;

public class DesafioEncadeada {

	public static void main(String[] args) {
		/*
		 * Acrescente uma captura de dado, perguntando ao usuario
		 * se � alfabetizado (1) ou n�o (0)
		 * Se ele n�o for alfabetizado n�o vota
		 * Altere o c�digo abaixo para melhor estrutura de decisao		
		 */

		byte alfabetizado = Byte.parseByte(JOptionPane.showInputDialog("Digite <1> para alfabetizado"));
		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		if (alfabetizado==1) {
			short idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));		
			if (idade<16) {	
				System.out.println(nome + " voc� ainda n�o pode votar");			
			}
			if (idade>=18 && idade <=70)  {
				System.out.println(nome + " voc� n�o � obrigado a votar ");
			}else {
				System.out.println(nome + " o seu voto � facultativo");
			}
		}else {
			System.out.println(nome + " voc� n�o pode votar");
		}


		}

	}
