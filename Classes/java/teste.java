public class teste {
    public static void main(String[] args) {
        Aluno Kayo = new Aluno("kayo", "2007", null, "infor", 0);
        Kayo.saudação();
        Kayo.Date();

        Professor Wendel = new Professor("Wendel", null, null, "Infor", 20, "Informática", 0);
        Wendel.saudação();

        Funcionario Perigoso = new Funcionario("perigoso", "1945", null, 10, "Faz-tudo", 1500);
        Perigoso.saudação();
    }
}
