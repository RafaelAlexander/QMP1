import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ReglasModa {
    private static final Map<CategoriaPrenda, List<TipoDePrenda>> prendaPosible = new HashMap<CategoriaPrenda, List<TipoDePrenda>>();
    public static void verificarCreacion(CategoriaPrenda categoriaPrenda, TipoDePrenda tipoDePrenda) throws PrendaImposibleException {
        if(!prendaPosible.get(categoriaPrenda).contains(tipoDePrenda)){
            throw new PrendaImposibleException("ERROR: Categoria no coencide con su tipo de prenda");
        }
    }
}
