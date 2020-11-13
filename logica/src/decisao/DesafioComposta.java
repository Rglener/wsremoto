package decisao;

import javax.swing.JOptionPane;

public class DesafioComposta {

	public static void main(String[] args) {
		/*
		 * Solicite o nome de um produto e a qtde em estoque
		 * Se a qtde estiver entre 20 e 40 deve retornar "estoque normal"
		 * Se a qtde estiver entre 41 e 60 deve retornar "estoque alto"
		 * Se a qtde for maior que 60 deve retornar "estoque lotado"
		 * Se a qtde for menor que 20 deve retornar "estoque baixo"
		 */
		String produto = JOptionPane.showInputDialog("Produto").toUpperCase();
		int estoque = Integer.parseInt(JOptionPane.showInputDialog("quantidade"));

		
		// Operadores relacionais
		// != (não igual)
		// ==(igual)
		
		if ( estoque>= 20 && estoque<= 40) {			
			System.out.println( produto + " com estoque normal");
		}else if (estoque >= 41 && estoque <= 60) {
			System.out.println( produto + " com estoque alto");			
		}else if (estoque > 60) {
			System.out.println( produto + " com estoque alto");			
		}else if (estoque < 20) {
		   System.out.println( produto + " com estoque baixo");
		}
			
		
	}

}
