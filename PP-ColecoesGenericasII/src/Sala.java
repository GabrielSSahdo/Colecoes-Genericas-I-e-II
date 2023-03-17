
public class Sala {
	int bloco;
	int sala;
	int capacidade;
	boolean acessivel;
	
	public Sala() {
		
	}
	
	public Sala(int bloco, int sala, int capacidade, boolean acessivel) {
		this.bloco = bloco;
		this.sala = sala;
		this.capacidade = capacidade;
		this.acessivel = acessivel;
	}
	
	public String acessibilidade() {
		String acesso;
		if(this.acessivel) {
			acesso = "acessível";
		}
		else {
			acesso = "não acessível";
		}
		return acesso;
	}
	
	public String getDescricao() {
		return "Bloco " +this.bloco+ ", Sala "+ this.sala +" ("+ this.capacidade +" lugares, "+acessibilidade()+")" ;
	}

}
