import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Prenda {
    private static Map<CategoriaPrenda, List<TipoDePrenda>> prendaPosible = new HashMap<CategoriaPrenda, List<TipoDePrenda>>();
    CategoriaPrenda categoriaPrenda;
    TipoDePrenda tipoDePrenda;
    Material material;
    Color principal;
    Color secundario;
    public Prenda(CategoriaPrenda categoriaPrenda,
                  TipoDePrenda tipoDePrenda,
                  Material material,
                  Color principal,
                  Color secundario) throws PrendaImposibleException {
        verificarCreacion(categoriaPrenda,tipoDePrenda);
        this.categoriaPrenda = Objects.
                               requireNonNull(categoriaPrenda,"ERROR: Indique categoria de prenda");
        //Asi con los demas hasta principal
        this.secundario = secundario;
    }

    public static void verificarCreacion(CategoriaPrenda categoriaPrenda, TipoDePrenda tipoDePrenda) throws PrendaImposibleException {
        if(!prendaPosible.get(categoriaPrenda).contains(tipoDePrenda)){
            throw new PrendaImposibleException("ERROR: Categoria no coencide con su tipo de prenda");
        }
    }
}
