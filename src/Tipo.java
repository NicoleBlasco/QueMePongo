import java.util.ArrayList;
import java.util.List;

public class Tipo {
    Categoria categoria;
    List<Material> materialesConsistentes = new ArrayList<>();

    Tipo(Categoria categoria, List materialesConsistentes){
        PrecondicionesValidas.validarQueNoSeaNull(categoria, "Falta poner la categoria");
        this.verificarQueSeCondicen(categoria);
        this.categoria = categoria;
        this.materialesConsistentes = materialesConsistentes;
    }

    void verificarQueSeCondicen(Categoria categoria){
        if(!categoria.contieneAl(this)){
            throw new RuntimeException("No se Condicen");
        }
    }

    Categoria getCategoria(){
        return categoria;
    }

    boolean esConsistenteCon(Material material){
        return this.materialesConsistentes.contains(material);
    }
}
