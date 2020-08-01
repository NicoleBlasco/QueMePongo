public class Prenda {
    Tipo tipo;
    Categoria categoria;
    Material material;
    Trama trama;
    Color colorPrincipal;
    Color colorSecundario = null;  //Puede ser que no haya tal color --> las prendas que no tengan dejaran este parametro vacio


    Prenda(Tipo _tipo, Material _material){

      PrecondicionesValidas.validarQueNoSeaNull(_tipo, "Falta el tipo al qe pertenece");
      PrecondicionesValidas.validarQueNoSeaNull(_material, "Falta poner el tipo de material");

      tipo = _tipo;
      categoria = _tipo.getCategoria();
      material = _material;
      colorPrincipal = _material.getColorPrincipal();
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
