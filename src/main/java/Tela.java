public class Tela {
    Trama trama;

    public Tela(Trama trama){
        if(trama == null){
            this.trama=Trama.LISA;
        }else{
            this.trama = trama;
        }
    }

    public Trama getTrama() {
        return trama;
    }
}
