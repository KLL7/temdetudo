public class Aluno extends Pessoa{
    public Aluno(String nome, String nascimento, String apelido, String _curso, int _mtr){
        super(nome, nascimento, apelido);
        this.curso = _curso;
        this.mtr = _mtr;
    }

    public String curso;
    public int mtr;
    public int no;

    public String Date() {
        return super.Date();
    }

    public void saudação() {
        super.saudação();
        super.saudação(curso, mtr);
    }
}