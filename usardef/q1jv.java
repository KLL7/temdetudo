public class q1jv {
    
    public static void main(String[] args) {
        System.out.println("Vamos somar!");

        int escolha = Integer.parseInt(System.console().readLine("Qual operação? (1)soma (2)subtração (3)multiplicação (4)divisão: "));
        
        while (escolha < 1 && escolha > 4) {
            System.out.println("número errado!");
            escolha = Integer.parseInt(System.console().readLine("Qual operação? (1)soma (2)subtração (3)multiplicação (4)divisão: "));
        }

        int um = Integer.parseInt(System.console().readLine("Coloque um número: "));
        int dois = Integer.parseInt(System.console().readLine("Coloque o segundo número: "));

        if (escolha == 1) {
            soma(um, dois);
        }
        if (escolha == 2) {
            sub(um, dois);
        }
        if (escolha == 3) {
            mult(um, dois);
        }
        if (escolha == 4) {
            div(um, dois);
        }
    }

    public static void soma(int num1, int num2) {
        System.out.println("Sua soma é: " + (num1 + num2));
    }

    public static void mult(int num1, int num2) {
        System.out.println("Sua multiplicação é: " + (num1 * num2));
    }

    public static void div(int num1, int num2) {
        System.out.println("Sua divisão é: " + (num1 / num2));
    }

    public static void sub(int num1, int num2) {
        System.out.println("Sua subtração é: " + (num1 - num2));
    }
};