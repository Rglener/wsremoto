package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * 1. Elabore uma aplica��o que leia o valor de dois n�meros inteiros e a opera��o aritm�tica desejada (+, -, * ou /); 
           calcule, ent�o, a resposta adequada.  
           Se optar por uma divis�o, leve em considera��o que n�o podemos ter um n�mero dividido por zero.

           2. Escreva um c�digo que leia tr�s valores inteiros e diferentes e mostre-os em ordem decrescente. 
		 */
		
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor1"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor2"));
		String operacao = JOptionPane.showInputDialog("Digite a operacao");
		
		if (operacao.equals("+"))  { 
			System.out.println("O resultado � :" + (valor1+valor2));
		}else if (operacao.contentEquals("-"))	{
			System.out.println("O resultado � :" + (valor1+valor2));
		}else if (operacao.contentEquals("*")) {
			System.out.println("O resultado � :" + (valor1+valor2));	
		}else if (operacao.contentEquals("/")) {
			if (valor2!=0) {
				System.out.println("O resultado �: " + (valor1/valor2) );
			}else {
				System.out.println("O segundo valor n�o pode ser zero");
			}
		}

	}
}












