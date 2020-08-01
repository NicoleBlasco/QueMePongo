public class Material {

    Color colorPrincipal;
    Tela tela;

    Material(Color colorPrincipal, Tela tela){
        PrecondicionesValidas.validarQueNoSeaNull(colorPrincipal, "Falta que tenga un color principal");
        PrecondicionesValidas.validarQueNoSeaNull(tela, "Falta que determine el material de la prenda, es decir, la tela");

        this.tela = tela;
        this.colorPrincipal = colorPrincipal;

    }

    Trama getTrama(){
        return tela.getTrama();
    }

    Color getColorPrincipal(){
        return colorPrincipal;
    }
}
