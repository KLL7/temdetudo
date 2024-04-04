import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Pessoa{
    private String name;
    public String ageStr;
    public Date date;
    public String apelas;

    public Pessoa(String _name, String _ageStr, String _apelas){
        this.name= _name;
        this.ageStr = _ageStr;
        this.apelas = _apelas;
    }


    public void saudação(String disciplina, int anos){
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

            System.out.println("Oi "+ name + "! "+ ola +", são: "+ horas + "! sua disciplina: "+ disciplina+ " Anos: "+anos );
        }



    public String Date() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy");
        date = new Date();
        int ano = Integer.parseInt(dateFormat.format(date));
        int nascimento = ano - Integer.parseInt(ageStr);
        System.out.println("Você tem: "+ nascimento+ " anos!");
        return dateFormat.format(date);
    }
}
