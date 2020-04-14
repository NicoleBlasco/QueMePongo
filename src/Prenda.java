public class Prenda {
    Categoria categoria;
    Material material;
    Color colorPrincipal;
    Color colorSecundario;  //Puede ser que no haya tal color --> las prendas que no tengan dejaran este parametro vacio
    Tipo tipo;

    Prenda(Categoria _categoria, Material _material, Color _colorPrincipal, Color _colorSecundario, Tipo _tipo){
      this.verificarQueSeCondicen(_categoria, _tipo);
      categoria = _categoria;
      material = _material;
      colorPrincipal = _colorPrincipal;
      colorSecundario = _colorSecundario;
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

        Color getColorSecundario(){
           return colorSecundario;
        }

}
