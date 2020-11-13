package variaveis;

import javax.swing.JOptionPane;

public class Notas {
/*
 * Solicitar um nome de aluno e duas notas, calcular a m�dia 
 * e exibir uma para para o aluno da seguinte forma:
 * "Aluno xxxxxx, sua m�dia obtida foi: xxxxxx para 10 faltam: xxxxxx pontos 
 */
	public static void main(String[] args) {
		// Tipo de refer�ncia: quando o tipo se refere a uma classe
		
		
				String nome = JOptionPane.showInputDialog("Digite o nome");
				// Tipo primitivo de refer�ncia: quando o tipo j� pertence a linguagem (comeca com letra minuscula)
				// Tipo primitivo precisa de um apoio. Esse apoio vem das classes "Wrappers".
				// int => Integer
				// double => Double
				// boolean => Boolean
				
				double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
				double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));				
			    double media = (nota1 + nota2) / 2;
			    
			    // ao digitar sysout + control + espa�o, ele comp�e System.out.println			    
			    // pelo professor System.out.println("Aluno " +  nome + ",sua m�dia obtida foi:" + media + " para 10 faltaram: " + (10-media) + "pontos");
			    
			    double calculo = 10 - media;
			    
				System.out.println("calculo ..: " + calculo);
			    System.out.printf("Aluno %s, sua m�dia obtida foi: %.1f para 10 faltam : %.1f pontos",nome,media,calculo);
			    
			    /* Tipos primitivos
			     * boolean  =>  Boolean   => true ou false
			     * char     => Character  => 1 caracter ('w')    entre apostrofos o aspas simples  ( qualquer caracter..)
			     
			     * S�o Inteiros
			     * byte     => Byte    (-127 at� +128)
			     * short    => Short   (-32.... at� +32......)
			     * int      => Integer (-2bi at� 2bi) 
			     * long     => Long    (n�mero cientifico)
			     
			     * S�o reais
			     * float    => Float   (para poucas casa decimais)
			     * double   => Double  ( para muitas casa decimais)
			     */
				

		

	}  // fecho o metodo

}     // fecha a classe     
