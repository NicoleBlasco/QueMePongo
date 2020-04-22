public class PrecondicionesValidas {
    static void validarQueNoSeaNull(Object value, String mensaje){
        if(value == null){
            throw new RuntimeException(mensaje);
        }
    }
}

