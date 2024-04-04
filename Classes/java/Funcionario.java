public class Funcionario extends Pessoa {
    public Funcionario(String _nome, String _ageStr, String _apelido, int _mtr, String _funcao, int _salario) {
		super(_nome, _ageStr, _apelido);
        this.mtr = _mtr;
        this.funcao = _funcao;
        this.salario = _salario;
    }
    public int mtr;
    public String funcao;
    public int salario;

    public void saudação() {
        super.saudação(funcao, salario);
    }
}
