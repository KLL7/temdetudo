public class Professor extends Aluno {

    public Professor(String _nome, String _ageStr, String _apelido, String _curso, int _mtr, String _disciplina, int _ano) {
		super(_nome, _ageStr, _apelido, _curso, _mtr);
        this.disciplina = _disciplina;
        this.ano = _ano;
	}
	public int ano;
	public String disciplina;

    public void saudação() {
        super.saudação(disciplina, ano);
    }
}