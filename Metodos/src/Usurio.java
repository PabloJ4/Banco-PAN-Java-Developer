public class Usurio {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();


        smartTv.dminuirVolume();
        smartTv.dminuirVolume();
        smartTv.dminuirVolume();
        smartTv.aumentarVolume();


        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("canal atual : " + smartTv.canal);
        System.out.println("volume atual : " + smartTv.volume);


        smartTv.ligar();
        System.out.println("Novo status --> TV ligada ? " + smartTv.ligada);


        smartTv.desligar();
        System.out.println("Novo status --> TV ligada ? " + smartTv.ligada);



        

    }
}