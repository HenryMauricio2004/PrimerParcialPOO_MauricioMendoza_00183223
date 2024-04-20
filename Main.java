import java.util.Scanner;
import java.util.ArrayList;

import Articulo.*;

public class Main {

    ArrayList<Articulo> inventario = new ArrayList<Articulo>();



    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int seleccion = 0;

        do {
            try{

                System.out.println("Ingrese la opcion que desea ejecutar");
                System.out.print("1. Revisar inventario \n2. Agregar Telefono al inventario \n3. Agregar Laptop al inventario \n 4.Modificar datos de articulo \n0.Salir\n>>");
                seleccion = scanner.nextInt();
                scanner.nextLine();

                switch (seleccion){
                    case 1:
                        imprimirInventario();
                        break;

                    case 2:
                        agregarTelefono();
                        break;

                    case 3:
                        agregarLaptop();
                        break;

                    case 4:
                        break;

                    default:
                        break;



                }


            }catch (Exception e){
                System.out.println("\n\nValor no valido, por favor intentelo nuevamente");
            }



        } while (seleccion > 0);


    }

    public void imprimirInventario(){
        int indice = 0;

        for(Articulo articulo : inventario){

            System.out.println("-------------------------------------------------");
            articulo.mostrarDatos();
            System.out.println("-------------------------------------------------");

            indice++;
        }
    }

    public void agregarTelefono(){
        Scanner scanner = new Scanner(System.in);


        Telefono telefono = new Telefono();

        System.out.println("Ingrese los datos que se solicitan: ");
        System.out.print("nombre: ");
        telefono.setNombre(scanner.nextLine());
        System.out.print("modelo: ");
        telefono.setModelo(scanner.nextLine());
        System.out.print("precio: ");
        telefono.setPrecio(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("longitud de pantalla: ");
        telefono.setLongitudPantalla(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("anchura de pantalla: ");
        telefono.setAnchuraPantalla(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("datos incluidos: ");
        telefono.setDatosGB(scanner.nextDouble());
        scanner.nextLine();

        System.out.print("cargador incluido [Y/N]: ");
        char caracter = scanner.nextLine().charAt(0);
        if (caracter == 'Y') {telefono.setCargadorIncluido(true);}
        else {telefono.setCargadorIncluido(false);}


        inventario.add(telefono);
    }

    public void agregarLaptop(){
        Scanner scanner = new Scanner(System.in);

        Laptop laptop = new Laptop();

        System.out.println("Ingrese los datos que se solicitan: ");
        System.out.print("nombre: ");
        laptop.setNombre(scanner.nextLine());
        System.out.print("modelo: ");
        laptop.setModelo(scanner.nextLine());
        System.out.print("precio: ");
        laptop.setPrecio(scanner.nextDouble());
        scanner.nextLine();

        System.out.print("largo: ");
        laptop.setLargo(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("ancho: ");
        laptop.setAncho(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("grosor: ");
        laptop.setGrosor(scanner.nextDouble());
        scanner.nextLine();

        System.out.print("longitud de pantalla: ");
        laptop.setLongitudPantalla(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("anchura de pantalla: ");
        laptop.setAnchuraPantalla(scanner.nextDouble());
        scanner.nextLine();

        System.out.print("RGB incluido [Y/N]: ");
        char caracter = scanner.nextLine().charAt(0);
        if (caracter == 'Y') {laptop.setRGB(true);}
        else {laptop.setRGB(false);}

        System.out.print("marca de procesador: ");
        laptop.setMarcaProcesador(scanner.nextLine());
    }


}
