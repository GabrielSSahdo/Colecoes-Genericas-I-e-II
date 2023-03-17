import java.util.ArrayList;
public class SessaoJedi {
	
	String nome;
	TreinadorJedi treinador;
	ArrayList<IniciadoJedi> iniciados = new ArrayList<IniciadoJedi>();
		
	public SessaoJedi(String nome, TreinadorJedi treinador) {
		this.nome = nome;
		this.treinador = treinador;
	}

	public void addIniciado(IniciadoJedi iniciado) {
		if(!iniciados.contains(iniciado)) {
			iniciados.add(iniciado);
		}
		
	}
		
	
	public IniciadoJedi getIniciado(String nome) {
		for(IniciadoJedi a: iniciados) {
			if(a.nome.equals(nome)) {
				return a;
			}
		}
		return null;
	}
	
	public double getMediaAnoNascimento() {
		double media = 0;
		for(IniciadoJedi iniciadoJedi: iniciados) {
			media += iniciadoJedi.anoNascimento;
		}
		return media/iniciados.size();
	}
	
	public String getDescricao() {
		String descricao = "--> SESSÃO " + this.nome + " (Treinador:" + this.treinador.titulacao + " " + this.treinador.nome +  ")";
		for (int i=0 ; i < iniciados.size() ; i++ ) {
			descricao += "\n   - Iniciado " + (i+1) + ": " + iniciados.get(i).getDescricao();
		}
		return descricao;
	}
	
}
