public class ParteSimple extends Parte {
  
  public ParteSimple(String numero, String nombre, double precioBase) {
    super(numero, nombre, precioBase);
  }
  public double getPrecio() {
    return precioBase *= 1.08;
  }
}
