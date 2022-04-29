import java.util.Objects;

public class Prenda {
  CategoriaPrenda categoriaPrenda;
  TipoDePrenda tipoDePrenda;
  Material material;
  Color principal;
  Color secundario;
  Trama trama;

  public Prenda(CategoriaPrenda categoriaPrenda,
                TipoDePrenda tipoDePrenda,
                Material material,
                Color principal,
                Color secundario,
                Trama trama) throws PrendaImposibleException {
    this.secundario = secundario;
  }


}
