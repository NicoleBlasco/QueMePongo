
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    List<Prenda> prendas = new ArrayList<>();

    void cargarPrenda(Categoria _categoria, Color _colorPrincipal, Tipo _tipo, Material _material){
       Prenda unaPrenda = new Prenda(_categoria, _material, _colorPrincipal, _tipo);
        prendas.add(unaPrenda);
    }

    //void generarAtuendo()

    Categoria identificarCategoria(Prenda prenda){
        return prenda.getCategoria();
    }

    Material indicarMaterial(Prenda prenda){
        return prenda.getMaterial();
    }

    Color indicarColorPrincipal(Prenda prenda){
        return prenda.getColorPrincipal();
    }

    Color indicarColorSecundario(Prenda prenda){
        return prenda.getColorSecundario();
    }


}
