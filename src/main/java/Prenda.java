import java.util.Objects;

public class Prenda {
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
        ReglasModa.verificarCreacion(categoriaPrenda,tipoDePrenda);
        this.categoriaPrenda = Objects.
                               requireNonNull(categoriaPrenda,"ERROR: Indique categoria de prenda");
        //Asi con los demas hasta principal
        this.secundario = secundario;
    }
}
