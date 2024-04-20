package Articulo;

import Articulo.Articulo;

public class Telefono extends Articulo {

    private double datosGB;
    private boolean cargadorIncluido;

    public Telefono(){
        super();
        datosGB = 0.0f;
        cargadorIncluido = false;
        super.setTipoArticulo("telefono");
    }

    public Telefono(String nombre, String modelo, double anchuraPantalla, double longitudPantalla, String descripcion, double precio, double datosGB, boolean cargadorInluido){
        super(nombre, modelo, anchuraPantalla, longitudPantalla, descripcion, precio);
        this.datosGB = datosGB;
        this.cargadorIncluido = cargadorInluido;
        super.setTipoArticulo("laptop");
    }

    public void modificarDatos(String nombre, String modelo, double anchuraPantalla, double longitudPantalla, String descripcion, double precio, double datosGB, boolean cargadorInluido){
        super.copiarDatos(nombre, modelo, anchuraPantalla, longitudPantalla, descripcion, precio);
        this.datosGB = datosGB;
        this.cargadorIncluido = cargadorInluido;
    }


    public void mostrarDatos(){
        System.out.printf("%s \t%f\n", getNombre(), getPrecio());
        System.out.printf("modelo: %s\n", getModelo());
        System.out.printf("Dimensiones de pantalla: %f inX%f in\n", getLongitudPantalla(), getAnchuraPantalla());

        if (cargadorIncluido){System.out.print("No ");}
        System.out.print("Incluye cargador\n");

        if (datosGB > 0){System.out.printf("datos incluidos por compra: %d GB\n", datosGB);}

        System.out.println(getDescripcion());
    }

    public double getDatosGB(){
        return datosGB;
    }

    public boolean getCargadorIncluido(){
        return cargadorIncluido;
    }

    public void setDatosGB(double datosGB){
        this.datosGB = datosGB;
    }

    public void setCargadorIncluido(boolean cargadorIncluido){
        this.cargadorIncluido = cargadorIncluido;
    }

}
