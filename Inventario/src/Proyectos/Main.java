package Proyectos;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        producto producto = new producto();
        boolean salir = false;
        while (!salir) {
            System.out.println("        Inventario Supermercado");
            System.out.println("********************************************");
            System.out.println("1. Ingresar un nuevo producto");
            System.out.println("2. Imprimir reporte");
            System.out.println("3. Salir");
            System.out.println("********************************************");

            try {
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        producto.ingresarProducto();
                        break;
                    case 2:
                        System.out.println("        Inventario Supermercado");
                        System.out.println("********************************************");
                        System.out.println("¿Como desea que se imprima el reporte?");
                        System.out.println("1. Orden ascendente");
                        System.out.println("2. Orden descendente");
                        System.out.println("********************************************");
                        try {
                            int opcion2 = sc.nextInt();
                            switch (opcion2) {
                                case 1:
                                    System.out.println("Seleccione el atributo por el cual ordenara el reporte.");
                                    System.out.println("1. Nombre");
                                    System.out.println("2. Marca");
                                    System.out.println("3. Numero de serie");
                                    System.out.println("4. Existencia");
                                    System.out.println("5. Punto de re-orden");
                                    System.out.println("6. Precio Unidad");
                                    System.out.println("");
                                    try {
                                        int opcion3 = sc.nextInt();
                                        switch (opcion3) {
                                            case 1:
                                                producto.ordenarNombre();
                                                break;
                                            case 2:
                                                producto.ordenarMarca();
                                                break;
                                            case 3:
                                                producto.ordenarSerie();
                                                break;
                                            case 4:
                                                producto.ordenarExistencia();
                                                break;
                                            case 5:
                                                producto.ordenarReorden();
                                                break;
                                            case 6:
                                                producto.ordenarUnidad();
                                                break;
                                            default:
                                                System.out.println("Ingrese un numero valido");
                                                break;
                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("Ingrese un numero valido");
                                        sc.next();
                                    }

                                    break;
                                case 2:
                                    System.out.println("Seleccione el atributo por el cual ordenara el reporte.");
                                    System.out.println("1. Nombre");
                                    System.out.println("2. Marca");
                                    System.out.println("3. Numero de serie");
                                    System.out.println("4. Existencia");
                                    System.out.println("5. Punto de re-orden");
                                    System.out.println("6. Precio Unidad");
                                    System.out.println("");
                                    try {
                                        int opcion3 = sc.nextInt();
                                        switch (opcion3) {
                                            case 1:
                                                producto.ordenarNombre1();
                                                break;
                                            case 2:
                                                producto.ordenarMarca1();
                                                break;
                                            case 3:
                                                producto.ordenarSerie1();
                                                break;
                                            case 4:
                                                producto.ordenarExistencia1();
                                                break;
                                            case 5:
                                                producto.ordenarReorden1();
                                                break;
                                            case 6:
                                                producto.ordenarUnidad1();
                                                break;
                                            default:
                                                System.out.println("Ingrese un numero valido");
                                                break;
                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("Ingrese un numero valido");
                                        sc.next();
                                    }
                                    break;
                                default:
                                    System.out.println("Ingrese un nuermo valido");
                                    break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Ingrese un numero valido.");
                            sc.next();
                        }

                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un valor valido");
                sc.next();

            }
        }


    }
}
