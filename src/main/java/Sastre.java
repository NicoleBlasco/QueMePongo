public abstract class Sastre {

    void fabricarUniforme(){
        new Uniforme(this.fabricarParteSuperior(), this.fabricarParteInferior(), this.fabricarCalzado());
    }

    protected abstract Prenda fabricarParteSuperior();
    protected abstract Prenda fabricarParteInferior();
    protected abstract Prenda fabricarCalzado();
}
