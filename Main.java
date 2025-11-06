public class Main {
    public static void main(String[] args) {
         ParteSimple prtSimple = new ParteSimple("123", "tornillo", 10.00);
        System.out.println("nombre prt simple: " + prtSimple.nombre);
        System.out.println("precio prt simple: " + prtSimple.getPrecio()); 

        ParteCompuesta prtCompuesta = new ParteCompuesta(12.0, "puerta", "parte", 10.0, "456");

        System.out.println("nombre: " + prtCompuesta.nombre);
        System.out.println("precio de la parte compuesta: " + prtCompuesta.getPrecio());
    }
    
}