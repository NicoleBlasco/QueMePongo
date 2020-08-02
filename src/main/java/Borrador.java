public class Borrador {
    Tipo tipo;
    Material material;
    Color colorSecundario;

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    Prenda crearPrenda(Tipo tipo, Material material, Color colorSecundario){

        Prenda prenda = new Prenda(tipo, material);
        prenda.setterColorSecundario(colorSecundario);
        return prenda;
    }
}
