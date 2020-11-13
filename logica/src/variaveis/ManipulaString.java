package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		String email = "xPto@itau-uniBanco.cOm.br";
		System.out.println("Original: " + email);
		System.out.println("Minuscula: " + email.toLowerCase());
		System.out.println("Maiuscula: " + email.toUpperCase());
		System.out.println("Qtde de Caracteres: " + email.length());
		System.out.println("Tem arroba? " + email.contains("@"));
		System.out.println("Posic�o do @: " + email.indexOf("@"));
		System.out.println("Do 2� at� o 4�: " + email.substring(1,5));
		// Exibir a primeira metade do email
		System.out.println("Primeira metade do email:" + email.substring(0,email.length()/2));
		// Exibir o usu�rio do email 
		System.out.println("Usuario do email: " + email.substring(0,email.indexOf("@")));
		// Exibir o servidor
		System.out.println("Servidor de email: " + 
		                 email.substring(email.indexOf("@")+1).toLowerCase());
		System.out.println("Compara��o com case sensitive: " + 
		                 email.equals("xpto@itau-unibanco.com.br"));
		System.out.println("Compara��o sem case sensitive: " + 
		                 email.equalsIgnoreCase("xpto@itau-unibanco.com.br")); 
		
		
		/*
		 * Identificador (nome de classe / nome de variavel / nome de m�todo)
		 * Regras:
		 * 1�) N�o come�ar com n�meros. Exemplo errado: 1berto
		 * 2�) N�o utilizar palavras reservadas da linguagem. Exemplos: public, double, int ( Dica: usar os nomes em portugu�s , com exce��o da super e final)
		 * 3�) N�o usar caracteres especiais. Exemplo: @, !,,.~%   -  pode usar o underline(_)
		 
		 * Padr�es:
		 * 1�) Nomes significativos
		 * 2�) Utilizar o padr�o CamelCase. 
		 *  Correto: dataDeNascimento,  Errado: datadenascimento ,  correto : data_de_nascimento
		 * 3�) Respeite as caixas e os padr�es dos recursos:
		 * Classe: SEMPRE come�a com maiuscula
		 * Variavel : sempre come�a com min�scula (substantivo)
		 * M�todo : sempre come�a com min�scula e � seguido de parenteses (verbo)
		 * xpto => variavel   
		 * 
		 * 
		 */

	}

}
