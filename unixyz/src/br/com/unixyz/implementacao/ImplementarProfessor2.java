package br.com.unixyz.implementacao;

import br.com.unixyz.beans.Endereco;
import br.com.unixyz.beans.Professor;

public class ImplementarProfessor2 {

	public static void main(String[] args) {
		Professor professor = new Professor();
		Endereco endereco = new Endereco();
		professor.setAll(
				1,
				"PASCOALLI",
				"DOUTOR",
				"1234-5678",
				endereco);
		endereco.setAll(
				"AVENIDA PAULISTA",
				"3500",
				false,
				"CENTRO",
				"SÃO PAULO",
				"SP",
				"12345-000"
				);
		System.out.println(professor.getAll());
		
		
		

	}

}
