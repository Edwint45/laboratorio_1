package ventas;


public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private final static int MAX_PRODUCTOS = 10;
    private int contadorProductos;
    private double total;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.contadorProductos = ++contadorProductos;
        this.productos = new Producto[MAX_PRODUCTOS];
    }
    
    public void agregarProducto(Producto producto){
        productos[contadorProductos]= producto;
    }
    
    public double calcularTotal(){
        
        for (int i = 0; i < 10; i++) {
            this.total = this.total + productos[i].getPrecio();
        }
        return this.total;
    }
    
    public void mostrarOrden(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Producto "+ productos[i] + " Nombre: "+ productos[i].getNombre()+" Precio " + productos[i].getPrecio());
        }
        System.out.println("Total: " + this.total);
    }
}
