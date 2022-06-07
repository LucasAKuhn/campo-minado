package br.com.luck.cm;

import br.com.luck.cm.modelo.Tabuleiro;
import br.com.luck.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
	}
}
