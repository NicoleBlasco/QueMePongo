import java.util.ArrayList;
import java.util.List;

abstract public class Categoria {
    List<Tipo> tiposIncluidos = new ArrayList<>();  //Despues se definirá en cada categoria.

    boolean contieneAl(Tipo tipo){
        return tiposIncluidos.contains(tipo);
    }
}
