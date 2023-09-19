public class SmartTv {
    private boolean ligada = false;
    private int canal = 1;
    private int volume = 25;
    private int volumeMaximo = 100;
    private int volumeMinimo = 0;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume = volume < volumeMaximo ? volume += 5 : volumeMaximo;
    }

    public void diminuirVolume() {
        volume = volume > volumeMinimo? volume -= 5 : volumeMinimo;
    }

    public void canalMais() {
        canal += 1;
    }

    public void canalMenos() {
        canal = canal > 1 ? canal -= 1 : canal;
    }

    public void escolherCanal(int canalEscolido) {
        canal = canalEscolido >= 1 ? canalEscolido : canal;
    }

    public boolean isLigada() {
        return ligada;
    }

    public int getVolume() {
        return volume;
    }

    public int getCanal() {
        return canal;
    }
}
