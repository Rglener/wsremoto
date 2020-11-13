package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.beans.Cd;
import br.com.ecommerce.beans.Livro;
import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.util.Magica;

public class implementarProduto {

	public static void main(String[] args) {
		
		// Cria pela super
		Produto objeto = new Produto();	
		
		do {
		char opcao = Magica.s("Digite <L> para Livro").charAt(0);
		if (opcao == 'L') {
			objeto = new Livro(
					Magica.s("Descri��o"),
					Magica.f("Valor Venda"),
					Magica.f("Valor Compra"),
					Magica.i("C�digo"),
					Magica.i("Qtde"),
					Magica.s("ISBN"),
					Magica.s("Autor"),
					Magica.s("Editora")					
					);			
			
		}else {
			objeto = new Cd(
					Magica.s("Descri��o"),
					Magica.f("Valor Venda"),
					Magica.f("Valor Compra"),
					Magica.i("C�digo"),
					Magica.i("Qtde"),
					Magica.s("Artista"),
					Magica.i("Total Faixas"),
					Magica.b("� lan�amento?")					
					);		
		}
		
		JOptionPane.showMessageDialog(null,objeto.getAll());
		JOptionPane.showMessageDialog(null,objeto.retornaImposto());
	
		}while(JOptionPane.showConfirmDialog(
				null,
				"Deseja coninuar?",
		        "Pergunta",
		        JOptionPane.YES_NO_OPTION		        
		        )==0
                );
	
	
		
		
		
		
		}

}
