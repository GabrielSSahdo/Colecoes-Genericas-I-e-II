import java.util.*;
public class Ensalamento {
	ArrayList<Sala> salas = new ArrayList<Sala>();
	ArrayList<Turma> turmas = new ArrayList<Turma>();
	ArrayList<TurmaEmSala> ensalamento = new ArrayList<TurmaEmSala>();
	
	public Ensalamento() {
	}
	
	public void addSala(Sala sala) {
		salas.add(sala);
	}
	
	private void addTurma(Turma turma) {
		turmas.add(turma);
	}
	
	

}
