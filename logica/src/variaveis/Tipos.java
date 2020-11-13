package variaveis;

public class Tipos {

	public static void main(String[] args) {
		// <tipo de dado> <nome da variavel/objeto>
		// string  (alfanumerico)
		// int (numeros inteiros) e double (numeros reais) númerico
		
		String nome = "Renato Glener";
		int idade = 47;
		double altura = 1.86;
		double peso = 99.300;
		System.out.println("Nome...: " + nome);
		System.out.println("Idade..: " + idade + "anos.");
		System.out.println("Altura.: " + altura + "metros.");
	    System.out.println("Peso...: " + peso + " kilos");

	    double imc = peso / (altura * altura);
	    // no printf() usamos :
	    
	    System.out.printf("IMC...: %.2f\n ", imc);
	    System.out.printf("%s seu imc é: %.2f\n",nome,imc);

	}

}
  