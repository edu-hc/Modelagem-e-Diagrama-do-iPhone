package dispositivos;

public class Teste {
	
	public static void main(String[] args) {
		
		IPhone IPhoneEdu = new IPhone();
		
		IPhoneEdu.ligar("7943974793");
		
		IPhoneEdu.atender();
		
		IPhoneEdu.iniciarCorreioVoz();
		
		
		IPhoneEdu.exibirPagina("web.dio.me");
		
		IPhoneEdu.adicionarNovaAba();
		
		IPhoneEdu.atualizarPagina();
		
		
		IPhoneEdu.selecionarMusica("Evidências");
		
		IPhoneEdu.tocar();
		
		IPhoneEdu.pausar();
	}
	

}
