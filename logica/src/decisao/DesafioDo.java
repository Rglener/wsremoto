package decisao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		/*
		 * 1� Parte
		 * Jogador 1 : digita um numero inteiro
		 * JOgador 2: tem que advinhar, eqto ele n�o acertar, a aplica��o fica pedindo para ele digitar um numero
		 * 
		 * 2� Parte
		 * Implemente dicas para o Jogador 2, informando se o numero que ele tem que advinhar � maior ou menor do que ele est� digitando
		 * 
		 * 3� Parte
		 * Exiba no final, a qtde de tentativas que foram utilizadas pelo jogador 2 at� que ele advinhasse o n�mero
		 * Dica: ter�o que criar um vari�vel pra contar!!
		 */

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�"));
		int chute = 0;
		int contador=0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Advinhe o n�"));
			contador=contador+1;
			//contador++;
			//contador+=1;
			if (numero>chute) {
				System.out.println("Chute mais alto");
			}else if (numero<chute) {
				System.out.println("Chute mais baixo");
			}
		}while(numero!=chute);
		System.out.println("Parab�ns voc� acertou com " + contador + " tentativa(s)");
		
		
		}
	}

	

				   



	
	
