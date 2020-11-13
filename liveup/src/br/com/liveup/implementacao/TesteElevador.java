package br.com.liveup.implementacao;

import br.com.liveup.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		Elevador teste = new Elevador();
		teste.prepararElevador(10, 0, 5);
		teste.subir();
		teste.entrar(12);
		System.out.println(teste.retornarTudo());
		teste.subir();
		teste.subir();
		teste.sair(10);
		System.out.println(teste.retornarTudo());
	}

}
