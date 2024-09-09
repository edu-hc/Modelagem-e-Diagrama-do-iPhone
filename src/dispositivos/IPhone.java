package dispositivos;

import dispositivos.componentes.AparelhoTelefonico;
import dispositivos.componentes.NavegadorInternet;
import dispositivos.componentes.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical  {
	
	
	// Funções componente AparelhoTelefonico
	
	public void ligar(String numero) {
		System.out.println("Ligando para " + numero + "...");
	}
	
	public void atender() {
		System.out.println("Ligação atendida! Conectando...");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("Abrindo correio de voz do IPhone...");
	}
	
	
	// Funções componente NavegadorInternet
	
	public void exibirPagina(String url) {
		System.out.println("Abrindo o link " + url);
		System.out.println("Página aberta!");
	}
	
	public void adicionarNovaAba() {
		System.out.println("Abrindo nova aba do navegador!");
	}
	
	public void atualizarPagina() {
		System.out.println("Recarregando página...");
		System.out.println("Página atualizada!");
	}
	
	
	// Funções componente ReprodutorMusical
	
	public void selecionarMusica(String musica) {
		System.out.println(musica + "selecionada!");
	}
	
	public void tocar() {
		System.out.println("Tocando música no IPhone...");
	}
	
	public void pausar() {
		System.out.println("Música pausada!");
	}
	

	
	
	

}
