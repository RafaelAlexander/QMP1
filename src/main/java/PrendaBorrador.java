import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PrendaBorrador {
  private static Map<TipoDePrenda, List<CategoriaPrenda>> prendaPosible = new HashMap<TipoDePrenda, List<CategoriaPrenda>>();
  CategoriaPrenda categoriaPrenda;
  TipoDePrenda tipoDePrenda;
  Material material = Material.LISA;
  Color principal;
  Color secundario;
  Trama trama;

  public static void verificarCreacion(CategoriaPrenda categoriaPrenda, TipoDePrenda tipoDePrenda) throws PrendaImposibleException {
    if (!prendaPosible.get(tipoDePrenda).contains(categoriaPrenda)) {
      throw new PrendaImposibleException("ERROR: Categoria no coencide con su tipo de prenda");
    }
  }

  private void verificarTipoNoNulo() {
    Objects.requireNonNull(this.tipoDePrenda, "Por favor, indique primerop tipo de prenda");
  }

  private void verificarValoresNoNulo() {
    Objects.requireNonNull(this.tipoDePrenda, "Por favor, indique primero tipo de prenda");
    Objects.requireNonNull(this.categoriaPrenda, "Por favor, indique primero categoria de prenda");
    Objects.requireNonNull(this.material, "Por favor, indique primero material");
    Objects.requireNonNull(this.principal, "Por favor, indique primero principal");
    Objects.requireNonNull(this.secundario, "Por favor, indique primero secundario");
  }

  public void elegirTipo(TipoDePrenda tipoDePrenda) {
    this.tipoDePrenda = tipoDePrenda;
  }

  public void elegirCategoria(CategoriaPrenda categoriaPrenda) throws PrendaImposibleException {
    verificarTipoNoNulo();
    verificarCreacion(this.categoriaPrenda, this.tipoDePrenda);
    this.categoriaPrenda = categoriaPrenda;
  }

  public void elegirMaterial(Material material) {
    verificarTipoNoNulo();
    this.material = material;
  }

  public void elegirPrincipal(Color principal) {
    verificarTipoNoNulo();
    this.principal = principal;
  }

  public void elegirSecundario(Color secundario) {
    verificarTipoNoNulo();
    this.principal = secundario;
  }

  public Prenda fabricarPrenda() throws PrendaImposibleException {
    verificarValoresNoNulo();
    verificarCreacion(this.categoriaPrenda, this.tipoDePrenda);
    return new Prenda(this.categoriaPrenda,this.tipoDePrenda,this.material,this.principal,this.secundario,this.trama);
  }
}
