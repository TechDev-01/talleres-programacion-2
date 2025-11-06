public class ParteCompuesta extends Parte {
  private double precioEnsamble;
  private String descripcion;

  public ParteCompuesta(double precioEnsamble, 
    String desc, 
    String nombre, 
    double precioBase, 
    String numero
  ) {
    super(numero, nombre, precioBase);
    this.precioEnsamble = precioEnsamble;
    this.descripcion = desc;
  }

  public double getPrecio() {
    return precioBase *= 1.11;
  }
}
