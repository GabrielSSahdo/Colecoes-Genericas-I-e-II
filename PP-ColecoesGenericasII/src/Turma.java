import java.util.*;
public class Turma {
	String nome;
	String professor;
	int numAlunos;
	boolean acessivel;
	ArrayList<Integer> horarios = new ArrayList<Integer>();
	
	public Turma() {
		
	}
	
	public Turma(String nome, String professor, int numAlunos, boolean acessivel) {
		this.nome = nome;
		this.professor = professor;
		this.numAlunos = numAlunos;
		this.acessivel = acessivel;
	}
	
	public void addHorario(int horario) {
		horarios.add(horario);
	}
	
	public String getHorariosString() {
		int resto;
		String hora = null, dia = null, horarioString = "";
		for (Integer horario : horarios) {
			resto = horario%7;
			
		switch(resto) {
		case 0:
			hora = "20hs";
			break;
		case 1:
			hora = "8hs";
			break;
		case 2:
			hora = "10hs";
			break;
		case 3:
			hora = "12hs";
			break;
		case 4:
			hora = "14hs";
			break;
		case 5:
			hora = "16hs";
			break;
		case 6:
			hora = "18hs";
			break;
			
		}
		
				
		if(horario<=7) {
			dia = "segunda";
		}else if(horario>7 && horario<=14) { 
			dia = "terça";
		}else if(horario>14 && horario<=21) {
			dia = "quarta";
		}else if(horario>21 && horario<=28) {
			dia = "quinta";
		}else if(horario>28 && horario<=35) {
			dia = "sexta";
		}
		horarioString += dia+" "+hora+", ";
		
		}
		return horarioString.substring(0, horarioString.length()-2);
		
		
	}
	
	public String acessibilidade() {
		String acesso;
		if(this.acessivel) {
			acesso = "sim";
		}
		else {
			acesso = "não";
		}
		return acesso;
	}
	
	public String getDescricao() {
		return "Turma: "+this.nome+"\nProfessor: "+this.professor+"\nNúmero de Alunos: "+this.numAlunos+"\nHorário: "+getHorariosString()+"\nAcessível: "+acessibilidade();
	}

}
