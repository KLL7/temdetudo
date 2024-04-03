public class main {
    public static void main(String[] args) {
        Aluno kayo = new Aluno("kayo");
        kayo.aluno(new Pessoa(), "kayo", "2007", null);
        kayo.Date();
        kayo.saudação();

        Aluno teste = new Aluno("teste");
        teste.aluno(new Pessoa(), "teste", "1945", null);
        teste.Date();
        teste.saudação();
    }
}