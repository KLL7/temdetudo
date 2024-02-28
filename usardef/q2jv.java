import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class q2jv {
    public static void main(String[] args) {

        LocalTime myObj = LocalTime.now();
        DateTimeFormatter newformat = DateTimeFormatter.ofPattern("HH");

        String Novo = myObj.format(newformat);

        int horas = Integer.parseInt(Novo);
        String ola = "";

        if (horas >= 6 && horas < 12){
            ola = "bom dia";
            System.out.println(ola);
        }

        else if (horas >=12 && horas <18) {
            ola = "boa tarde";
            System.out.println(ola);
        }

        else {
            ola = "boa noite";
            System.out.println(ola);
        }
        
        hour(horas, ola);
    }

public static void hour(int hora, String dia){
    System.out.println("Olá, no seu sistema são: "+ hora);
    System.out.println("Ou seja: "+ dia);
    return;
}
}
