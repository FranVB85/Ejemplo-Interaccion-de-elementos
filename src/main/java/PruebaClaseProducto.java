public class PruebaClaseProducto {

    public static void main(String[] args) {
        Producto p = new Producto();
        p.asignaProducto(200201,15.8);
        System.out.println(p.toString());

        Producto q = new Producto();
        q.asignaCodigo(200202);
        q.pone(34.3);
        System.out.println(q.toString());
    }
}
