import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Aluno{
    private String name;
    public String ageStr;
    public Date date;
    public String apelas;
    Aluno(String name){
    setName(name);
}



public void aluno(Pessoa pessoa, String nome, String nascimento, String apelido){
    pessoa.setNome(nome);
    pessoa.setIdade(nascimento);
    pessoa.Apelido = apelido;
    apelas = apelido;
    ageStr = nascimento;

    System.out.println(nome);
    System.out.println(nascimento);
}

    public void saudação(){
        LocalTime myObj = LocalTime.now();
        DateTimeFormatter newformat = DateTimeFormatter.ofPattern("HH");

        String novo = myObj.format(newformat);
        int horas = Integer.parseInt(novo);
        String ola = "";

        if (horas >= 6 && horas < 12){
            ola = "Bom dia";
        }

        else if (horas >= 12 && horas < 18){
            ola = "Boa tarde";
        }

        else{
            ola = "Boa noite";
        }

        if (apelas != null){
            System.out.println("Oi "+ name + "! "+ ola +", são: "+ horas + "! Você possui apelido, que interessante: " + apelas +"!");
        }
        else{
            System.out.println("Oi "+ name + "! "+ ola +", são: "+ horas + " horas!");
        }
    }



    public String Date() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy");
        date = new Date();
        int ano = Integer.parseInt(dateFormat.format(date));
        int nascimento = ano - Integer.parseInt(ageStr);
        System.out.println("Você tem: "+ nascimento+ " anos!");
        return dateFormat.format(date);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}