public class PrecondicionesValidas {
    static void validarQueNoSeaNull(Object value, String mensaje){
        if(value == null){
            throw new RuntimeException(mensaje);
        }
    }

    static void validarConsistencia(Material material, Tipo tipo){
        if (!tipo.esConsistenteCon(material)) {
            throw new RuntimeException("El material no es consistente con el tipo de prenda que pasó");
        }
    }

    static void validarQueSeCondicen(Categoria categoria1, Categoria categoria2){
        if(categoria1 != categoria2){
            throw new RuntimeException("No se condicen");
        }
    }
}

