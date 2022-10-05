package edu.hilario.metodos;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Qual o canal atual da TV? " + "Canal: " + smartTv.canal);
        System.out.println("Qual o volume atual da TV? " + "Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Agora a TV está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Agora a TV está ligada? " + smartTv.ligada);
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        smartTv.aumentarVolume();

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();

        smartTv.digitarCanal(183);

    }
}
