package br.com.liveup.modelo;

public class Elevador {

	private int andarAtual;
	private int andarMaximo;
	private int andarMinimo;
	private int capacidadePessoas;
	private int qtdePessoas;
	private String nome;
	
	public void prepararElevador(int pAndarMaximo, int pAndarMinimo, int pCapacidade) {
		andarMaximo = pAndarMaximo;
		andarMinimo=pAndarMinimo;
		capacidadePessoas= pCapacidade;
	}
	
	public String retornarTudo() {
		return 
				"Andar Atual....................: " + andarAtual + "\n" +
				"Andar Máximo...................: " + andarMaximo + "\n" + 
				"Andar Mínimo...................: " + andarMinimo + "\n" + 
				"Capacidade Máxima de Pessoas...: " + capacidadePessoas + "\n" + 
				"Qtde de Pessoas atual..........: " + qtdePessoas + "\n" + 
				"Nome...........................: " + nome;
	}
	
	
	public void descer() {
		if (andarAtual>andarMinimo) {
			andarAtual--;
		}
	}
	
	public void subir() {
		if (andarAtual<andarMaximo) {
			andarAtual++;
		}
	}
	
	public void sair(int pQtde) {
		if ((qtdePessoas-pQtde)>=0) {
			qtdePessoas-=pQtde;
		}
	}
	
	
	public void entrar(int pQtde) {
		if ((pQtde+qtdePessoas)<=capacidadePessoas) {
			qtdePessoas+=pQtde;
		}
	}
	
}