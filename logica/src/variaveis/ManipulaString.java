package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		String email = "xPto@itau-uniBanco.cOm.br";
		System.out.println("Original: " + email);
		System.out.println("Minuscula: " + email.toLowerCase());
		System.out.println("Maiuscula: " + email.toUpperCase());
		System.out.println("Qtde de Caracteres: " + email.length());
		System.out.println("Tem arroba? " + email.contains("@"));
		System.out.println("Posicão do @: " + email.indexOf("@"));
		System.out.println("Do 2º até o 4º: " + email.substring(1,5));
		// Exibir a primeira metade do email
		System.out.println("Primeira metade do email:" + email.substring(0,email.length()/2));
		// Exibir o usuário do email 
		System.out.println("Usuario do email: " + email.substring(0,email.indexOf("@")));
		// Exibir o servidor
		System.out.println("Servidor de email: " + 
		                 email.substring(email.indexOf("@")+1).toLowerCase());
		System.out.println("Comparação com case sensitive: " + 
		                 email.equals("xpto@itau-unibanco.com.br"));
		System.out.println("Comparação sem case sensitive: " + 
		                 email.equalsIgnoreCase("xpto@itau-unibanco.com.br")); 
		
		
		/*
		 * Identificador (nome de classe / nome de variavel / nome de método)
		 * Regras:
		 * 1º) Não começar com números. Exemplo errado: 1berto
		 * 2º) Não utilizar palavras reservadas da linguagem. Exemplos: public, double, int ( Dica: usar os nomes em português , com exceção da super e final)
		 * 3º) Não usar caracteres especiais. Exemplo: @, !,,.~%   -  pode usar o underline(_)
		 
		 * Padrões:
		 * 1º) Nomes significativos
		 * 2º) Utilizar o padrão CamelCase. 
		 *  Correto: dataDeNascimento,  Errado: datadenascimento ,  correto : data_de_nascimento
		 * 3º) Respeite as caixas e os padrões dos recursos:
		 * Classe: SEMPRE começa com maiuscula
		 * Variavel : sempre começa com minúscula (substantivo)
		 * Método : sempre começa com minúscula e é seguido de parenteses (verbo)
		 * xpto => variavel   
		 * 
		 * 
		 */

	}

}
