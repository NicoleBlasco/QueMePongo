public class Prenda {
    Tipo tipo;
    Categoria categoria;
    Material material;
    Trama trama;
    Color colorPrincipal;
    Color colorSecundario;  //Puede ser que no haya tal color --> las prendas que no tengan dejaran este parametro vacio


    Prenda(Tipo tipo, Material material){

      PrecondicionesValidas.validarQueNoSeaNull(tipo, "Falta el tipo al que pertenece");
      PrecondicionesValidas.validarQueNoSeaNull(material, "Falta poner el tipo de material");

      this.tipo = tipo;
      categoria = tipo.getCategoria();
      this.material = material;
      colorPrincipal = material.getColorPrincipal();
      trama = material.getTrama();
    }


    Categoria getCategoria(){
            return categoria;
        }

    Material getMaterial(){
            return material;
        }

    Color getColorPrincipal(){
            return colorPrincipal;
        }

    void setterColorSecundario(Color unColor){
           colorSecundario = unColor;
        }

    Color getColorSecundario(){
        return colorSecundario;
    }

}
