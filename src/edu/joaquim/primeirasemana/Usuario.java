package edu.joaquim.primeirasemana;

public class Usuario {
    public static void main(String[] args){
        SmartTV smartTV = new SmartTV();

        System.out.println("TV ligada : " + smartTV.ligada);
        System.out.println("Canal atual : " +smartTV.canal);
        System.out.println("Volume atual : " +smartTV.volume);

        smartTV.ligar();
        System.out.println("TV ligada : " + smartTV.ligada);
        smartTV.aumentarVolume();
        System.out.println("Volume atual : " + smartTV.volume);
        smartTV.aumentarVolume();
        System.out.println("Volume atual : " + smartTV.volume);
        smartTV.mudarCanal(13);
        System.out.println(smartTV.canal);
        smartTV.desligar();
        System.out.println(smartTV.ligada);
        smartTV.diminuirVolume();
        smartTV.aumentarCanal();
        smartTV.diminuirCanal();
        System.out.println(smartTV.canal);
        System.out.println(smartTV.volume);



    }
}
