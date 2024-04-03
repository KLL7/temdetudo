import java.util.Date;

public class Pessoa {
    private String nome;
    private String idade;
    public String Apelido;
    public Date date; 

//  Demonstração de pegar coisas em private

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getIdade(){
        return idade;
    }

    public void setIdade(String idade){
        this.nome = idade;
    }
}