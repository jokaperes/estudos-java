package edu.joaquim.primeirasemana;


public class tipos_e_variaveis {
    public static void main(String[] args) {
        String primeiro = "Joaquim";
        String segundo = "Neto";
        int numero = 1;
        int numero2 = 20;
        final double PI = 3.14;

        boolean condicao2 = true;





        System.out.println(condicao2);


        String nomeCompleto2;
        nomeCompleto2 = nomeCompleto(primeiro, segundo);
        int resultado = somar(numero, numero2);
        System.out.println(resultado);
        System.out.println(nomeCompleto2);
        System.out.println(PI);

    }
    public static String nomeCompleto(String primeiro, String segundo){
        return primeiro.concat(" ").concat(segundo);
    }
    public static int somar(int numero, int numero2){
        return numero + numero2;
    }

}
