public class Material {

    Color colorPrincipal;
    Trama trama;
    Tela tela;

    Material(Color colorPrincipal, Trama trama, Tela tela){
        PrecondicionesValidas.validarQueNoSeaNull(colorPrincipal, "Falta que tenga un color principal");
        PrecondicionesValidas.validarQueNoSeaNull(tela, "Falta que determine el material de la prenda, es decir, la tela");

        if (trama == null){
            this.trama = new Lisa(); //No sé si acá es valido instanciar porq habian dicho que se instanciaba en los test
        }

        this.colorPrincipal = colorPrincipal;
        this.trama = trama;

    }

    Trama getTrama(){
        return trama;
    }

    Color getColorPrincipal(){
        return colorPrincipal;
    }
}
