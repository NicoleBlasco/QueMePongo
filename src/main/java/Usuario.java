
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    List<Prenda> prendas = new ArrayList<>();

    void cargarPrenda(Prenda unaPrenda){
      prendas.add(unaPrenda);
    }

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
