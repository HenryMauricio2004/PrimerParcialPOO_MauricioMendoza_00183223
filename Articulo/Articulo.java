package Articulo;

abstract public class Articulo {

    private String nombre;
    private String modelo;

    private double longitudPantalla;
    private double anchuraPantalla;

    protected String descripcion;
    protected double precio;

    private String tipoArticulo;


    public Articulo(){
        nombre = "";
        modelo = "";

        descripcion = "";
        precio = 0.0f;
        tipoArticulo = "";
    }

    public Articulo(String nombre, String modelo, double anchuraPantalla, double longitudPantalla, String descripcion, double precio){
        this.nombre = nombre;
        this.modelo = modelo;
        this.longitudPantalla = longitudPantalla;
        this.anchuraPantalla = anchuraPantalla;

        this.descripcion = descripcion;
        this.precio = precio;
    }

    public void copiarArticulo(Articulo articulo){
        this.nombre = articulo.getNombre();
        this.modelo = articulo.getModelo();
        this.longitudPantalla = articulo.getLongitudPantalla();
        this.anchuraPantalla = articulo.getAnchuraPantalla();
        this.descripcion = articulo.getDescripcion();
        this.precio = articulo.getPrecio();
    }


    public void copiarDatos(String nombre, String modelo, double anchuraPantalla, double longitudPantalla, String descripcion, double precio){
        this.nombre = nombre;
        this.modelo = modelo;
        this.longitudPantalla = longitudPantalla;
        this.anchuraPantalla = anchuraPantalla;

        this.descripcion = descripcion;
        this.precio = precio;
    }

    abstract public void mostrarDatos();

    public String getNombre(){
        return nombre;
    }

    public String getModelo(){
        return modelo;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public double getPrecio(){
        return precio;
    }


    public double getLongitudPantalla(){
        return longitudPantalla;
    }

    public double getAnchuraPantalla(){
        return anchuraPantalla;
    }

    public String getTipoArticulo(){
        return tipoArticulo;
    }


    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public void setTipoArticulo(String tipoArticulo){
        this.tipoArticulo = tipoArticulo;
    }

    public void setAnchuraPantalla(double anchuraPantalla) {
        this.anchuraPantalla = anchuraPantalla;
    }

    public void setLongitudPantalla(double longitudPantalla) {
        this.longitudPantalla = longitudPantalla;
    }
}
