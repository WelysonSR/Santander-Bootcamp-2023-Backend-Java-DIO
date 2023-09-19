public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada: " + smartTv.isLigada());
        System.out.println("Canal Atual: " + smartTv.getCanal());
        System.out.println("Volume Atual: " + smartTv.getVolume());

        smartTv.ligar();
        System.out.println("Tv Ligada: " + smartTv.isLigada());

        smartTv.desligar();
        System.out.println("Tv Ligada: " + smartTv.isLigada());

        smartTv.diminuirVolume();
        System.out.println("Volume Atual: " + smartTv.getVolume());

        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.getVolume());

        smartTv.canalMais();
        System.out.println("Canal Atual: " + smartTv.getCanal());

        smartTv.canalMenos();
        System.out.println("Canal Atual: " + smartTv.getCanal());

        smartTv.escolherCanal(25);
        System.out.println("Canal Atual: " + smartTv.getCanal());
    }
}
