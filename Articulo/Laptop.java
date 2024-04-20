package Articulo;

import Articulo.Articulo;

public class Laptop extends Articulo {

    private double ancho;
    private double largo;
    private double grosor;

    private boolean rgb;
    private String marcaProcesador;
    public Laptop(){
        super();
        ancho = 0.0f;
        largo = 0.0f;
        grosor = 0.0f;
        rgb = false;
        marcaProcesador = "";
        super.setTipoArticulo("laptop");
    }

    public Laptop(String nombre, String modelo, double anchuraPantalla, double longitudPantalla, String descripcion, double precio, double ancho, double largo, double grosor, boolean rgb, String marcaProcesador){
        super(nombre, modelo, anchuraPantalla, longitudPantalla, descripcion, precio);
        this.ancho = ancho;
        this.largo = largo;
        this.grosor = grosor;
        this.marcaProcesador = marcaProcesador;
        super.setTipoArticulo("laptop");
    }

    public void mostrarDatos(){
        System.out.printf("%s \t%f\n", getNombre(), getPrecio());
        System.out.printf("modelo: %s\t%s", getModelo(), marcaProcesador);
        if (rgb) {System.out.print("\t(RGB)");}

        System.out.printf("\nDimensiones: %f inX%f in X%f in\n", largo, ancho, grosor);
        System.out.printf("Dimensiones de pantalla: %f inX%f in\n", getLongitudPantalla(), getAnchuraPantalla());

        System.out.println(getDescripcion());
    }

    public double getAncho(){
        return ancho;
    }

    public double getLargo(){
        return largo;
    }

    public double getGrosor(){
        return grosor;
    }

    public boolean getRGB(){
        return rgb;
    }

    public String getMarcaProcesador(){
        return marcaProcesador;
    }

    public void setAncho(double ancho){
        this.ancho = ancho;
    }

    public void setLargo(double largo){
        this.largo = largo;
    }

    public void setGrosor(double grosor){
        this.grosor = grosor;
    }

    public void setRGB(boolean rgb){
        this.rgb = rgb;
    }

    public void setMarcaProcesador(String marcaProcesador){
        this.marcaProcesador = marcaProcesador;
    }
}
