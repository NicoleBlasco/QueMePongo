public class Prenda {
    Categoria categoria;
    Material material;
    Color colorPrincipal;
    Color colorSecundario = null;  //Puede ser que no haya tal color --> las prendas que no tengan dejaran este parametro vacio
    Tipo tipo;

    Prenda(Categoria _categoria, Material _material, Color _colorPrincipal, Tipo _tipo){
      PrecondicionesValidas.validarQueNoSeaNull(_categoria, "Falta poner la categoria");
      PrecondicionesValidas.validarQueNoSeaNull(_material, "Falta poner el tipo de material");
      PrecondicionesValidas.validarQueNoSeaNull(_colorPrincipal, "Falta que tenga un color principal");
      PrecondicionesValidas.validarQueNoSeaNull(_tipo, "Falta el tipo al qe pertenece");
      this.verificarQueSeCondicen(_categoria, _tipo);
      categoria = _categoria;
      material = _material;
      colorPrincipal = _colorPrincipal;
      tipo = _tipo;
    }

    void verificarQueSeCondicen(Categoria categoria, Tipo tipo){
        if(!categoria.contieneAl(tipo)){
            throw new RuntimeException("No se Condicen");
        }
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
