public class Monografia {
	private long numero;
	private double titulo;
	private Aluno aluno;
	private Professor professor;
	private Disciplina disciplina;

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public void setTitulo(double titulo) {
		this.titulo = titulo;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public long getNumero() {
		return numero;
	}

	public double getTitulo() {
		return titulo;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public Professor getProfessor() {
		return professor;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}
}
