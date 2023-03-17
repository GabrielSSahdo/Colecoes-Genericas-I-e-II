public class SessaoJediMain {

	public static void main(String[] args) {
		
		IniciadoJedi iniciado1 = new IniciadoJedi("gabe", "mula", 2000);
		TreinadorJedi treinador1 = new TreinadorJedi("cunhado", "gio");
		SessaoJedi sessaoJedi1 = new SessaoJedi("Daddy, How i do ?", treinador1);
		
		sessaoJedi1.addIniciado(iniciado1);
		
		System.out.println(sessaoJedi1.getDescricao());
		
	}
}
