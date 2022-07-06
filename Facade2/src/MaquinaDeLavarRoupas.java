public class MaquinaDeLavarRoupas {
    
    public void lavaRoupaMuitoSuja() {
        setTemperaturaAgua(100);
        setDuracaoCicloLavagem(90);
        setDuracaoCicloRotagem (10);
        addDetergente();
        addAlvejante();
        addAmaciante();
        aquecerAgua();
        iniciarLavagem();
    }

    public void lavaRoupaPoucoSuja() {
        setTemperaturaAgua(40);
        setDuracaoCicloLavagem(20);
        setDuracaoCicloRotagem(10);
        addDetergente();
        aquecerAgua();
        iniciarLavagem();
    }

}
