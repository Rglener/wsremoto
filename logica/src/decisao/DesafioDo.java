package decisao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		/*
		 * 1º Parte
		 * Jogador 1 : digita um numero inteiro
		 * JOgador 2: tem que advinhar, eqto ele não acertar, a aplicação fica pedindo para ele digitar um numero
		 * 
		 * 2º Parte
		 * Implemente dicas para o Jogador 2, informando se o numero que ele tem que advinhar é maior ou menor do que ele está digitando
		 * 
		 * 3º Parte
		 * Exiba no final, a qtde de tentativas que foram utilizadas pelo jogador 2 até que ele advinhasse o número
		 * Dica: terão que criar um variável pra contar!!
		 */

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um nº"));
		int chute = 0;
		int contador=0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Advinhe o nº"));
			contador=contador+1;
			//contador++;
			//contador+=1;
			if (numero>chute) {
				System.out.println("Chute mais alto");
			}else if (numero<chute) {
				System.out.println("Chute mais baixo");
			}
		}while(numero!=chute);
		System.out.println("Parabéns você acertou com " + contador + " tentativa(s)");
		
		
		}
	}

	

				   



	
	
