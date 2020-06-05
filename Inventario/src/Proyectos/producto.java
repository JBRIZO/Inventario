package Proyectos;


import java.util.Scanner;

public class producto {


    private String[] nombre = new String[3];
    private String[] marca = new  String[3];
    private int[] numSerie = new int[3];
    private int[] existencia = new int[3];
    private int[] reOrden = new int[3];
    private int[] unidad = new int[3];
    private int cont=0;

    //constructores
    public producto(){}

    public producto(String[] nombre, String[] marca, int[] numSerie, int[] unidades)
    {
        this.nombre = nombre;
        this.marca = marca;
        this.numSerie = numSerie;
        this.unidad = unidades;
    }
//gets y sets

    public int[] getExistencia() {
        return existencia;
    }

    public void setExistencia(int[] existencia) {
        this.existencia = existencia;
    }

    public int[] getReOrden() {
        return reOrden;
    }

    public void setReOrden(int[] reOrden) {
        this.reOrden = reOrden;
    }



    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }


    public String[] getMarca() {
        return marca;
    }

    public void setMarca(String[] marca) {
        this.marca = marca;
    }

    public int[] getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int[] numSerie) {
        this.numSerie = numSerie;
    }

    public int[] getUnidad() {
        return unidad;
    }

    public void setUnidad(int[] unidad) {
        this.unidad = unidad;
    }


    public void ingresarProducto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un producto.");
        System.out.println("Nombre:");
        String pdct = sc.nextLine();
        nombre[cont] = pdct;
        System.out.println("Marca:");
        String marcas = sc.nextLine();
        marca[cont] = marcas;
        System.out.println("Numero de serie");
        int serie = sc.nextInt();
        numSerie[cont] = serie;
        System.out.println("En Existencia:");
        int enExistencia = sc.nextInt();
        existencia[cont] = enExistencia;
        System.out.println("Punto de Re-orden:");
        int reorden = sc.nextInt();
        reOrden[cont] = reorden;
        System.out.println("Precio Unitario");
        int unitario = sc.nextInt();
        unidad[cont] = unitario;
        cont++;

    }

    public void mostrarProductos()
    {
        for (int numero = 0; numero < cont  ; numero++ ){
            System.out.println("Producto "+(numero+1));
            System.out.println(nombre[numero]);
            System.out.println(marca[numero]);
            System.out.println(numSerie[numero]);
            System.out.println(existencia[numero]);
            System.out.println(reOrden[numero]);
            System.out.println(unidad[numero]);
            System.out.println("");
        }

    }
    //ordenamiento ascendente
    public void ordenarNombre()
    {
        for (int j = 0; j < nombre.length-1; j++) {
            for (int i = 0; i < nombre.length - j-1; i++) {
                if (nombre[i].compareTo(nombre[i + 1]) > 0) {
                    String aux;
                    aux = nombre[i];
                    nombre[i] = nombre[i + 1];
                    nombre[i + 1] = aux;
                }
            }
        }
        for (int i = 0;i<nombre.length;i++){
            System.out.println(nombre[i]);
        }
    }

    public void ordenarMarca()
    {
        for (int j = 0; j < marca.length-1; j++) {
            for (int i = 0; i < marca.length - j-1; i++) {
                if (nombre[i].compareTo(marca[i + 1]) > 0) {
                    String aux;
                    aux = marca[i];
                    marca[i] = marca[i + 1];
                    marca[i + 1] = aux;
                }
            }
        }
        for (int i = 0;i<marca.length;i++){
            System.out.println(marca[i]);
        }
    }

    public void ordenarSerie()
    {
        for (int i = 0; i < numSerie.length - 1; i++)
        {
            for (int j = 0; j < numSerie.length - i - 1; j++) {
                if (numSerie[j + 1] < numSerie[j]) {
                    int aux;
                    aux = numSerie[j + 1];
                    numSerie[j + 1] = numSerie[j];
                    numSerie[j] = aux;
                }
            }
        }
        for (int i = 0;i<numSerie.length;i++){
            System.out.println(numSerie[i]);
        }
    }

    public void ordenarExistencia()
    {
        for (int i = 0; i < existencia.length - 1; i++)
        {
            for (int j = 0; j < existencia.length - i - 1; j++) {
                if (existencia[j + 1] < existencia[j]) {
                    int aux;
                    aux = existencia[j + 1];
                    existencia[j + 1] = existencia[j];
                    existencia[j] = aux;
                }
            }
        }
        for (int i = 0;i<existencia.length;i++){
            System.out.println(existencia[i]);
        }
    }

    public void ordenarReorden()
    {
        for (int i = 0; i < reOrden.length - 1; i++)
        {
            for (int j = 0; j < reOrden.length - i - 1; j++) {
                if (reOrden[j + 1] < reOrden[j]) {
                    int aux;
                    aux = reOrden[j + 1];
                    reOrden[j + 1] = reOrden[j];
                    reOrden[j] = aux;
                }
            }
        }
        for (int i = 0;i<reOrden.length;i++){
            System.out.println(reOrden[i]);
        }
    }

    public void ordenarUnidad()
    {
        for (int i = 0; i < unidad.length - 1; i++)
        {
            for (int j = 0; j < unidad.length - i - 1; j++) {
                if (unidad[j + 1] < unidad[j]) {
                    int aux;
                    aux = unidad[j + 1];
                    unidad[j + 1] = unidad[j];
                    unidad[j] = aux;
                }
            }
        }
        for (int i = 0;i<unidad.length;i++){
            System.out.println(unidad[i]);
        }
    }

    //descendente
    public void ordenarNombre1()
    {
        for (int j = 0; j < nombre.length-1; j++) {
            for (int i = 0; i < nombre.length - j-1; i++) {
                if (nombre[i].compareTo(nombre[i + 1]) < 0) {
                    String aux;
                    aux = nombre[i];
                    nombre[i] = nombre[i + 1];
                    nombre[i + 1] = aux;
                }
            }
        }
        for (int i = 0;i<nombre.length;i++){
            System.out.println(nombre[i]);
        }
    }

    public void ordenarMarca1()
    {
        for (int j = 0; j < marca.length-1; j++) {
            for (int i = 0; i < marca.length - j-1; i++) {
                if (nombre[i].compareTo(marca[i + 1]) < 0) {
                    String aux;
                    aux = marca[i];
                    marca[i] = marca[i + 1];
                    marca[i + 1] = aux;
                }
            }
        }
        for (int i = 0;i<marca.length;i++){
            System.out.println(marca[i]);
        }
    }

    public void ordenarSerie1()
    {
        for (int i = 0; i < numSerie.length - 1; i++)
        {
            for (int j = 0; j < numSerie.length - i - 1; j++) {
                if (numSerie[j + 1] > numSerie[j]) {
                    int aux;
                    aux = numSerie[j + 1];
                    numSerie[j + 1] = numSerie[j];
                    numSerie[j] = aux;
                }
            }
        }
        for (int i = 0;i<numSerie.length;i++){
            System.out.println(numSerie[i]);
        }
    }

    public void ordenarExistencia1()
    {
        for (int i = 0; i < existencia.length - 1; i++)
        {
            for (int j = 0; j < existencia.length - i - 1; j++) {
                if (existencia[j + 1] > existencia[j]) {
                    int aux;
                    aux = existencia[j + 1];
                    existencia[j + 1] = existencia[j];
                    existencia[j] = aux;
                }
            }
        }
        for (int i = 0;i<existencia.length;i++){
            System.out.println(existencia[i]);
        }
    }

    public void ordenarReorden1()
    {
        for (int i = 0; i < reOrden.length - 1; i++)
        {
            for (int j = 0; j < reOrden.length - i - 1; j++) {
                if (reOrden[j + 1] > reOrden[j]) {
                    int aux;
                    aux = reOrden[j + 1];
                    reOrden[j + 1] = reOrden[j];
                    reOrden[j] = aux;
                }
            }
        }
        for (int i = 0;i<reOrden.length;i++){
            System.out.println(reOrden[i]);
        }
    }

    public void ordenarUnidad1()
    {
        for (int i = 0; i < unidad.length - 1; i++)
        {
            for (int j = 0; j < unidad.length - i - 1; j++) {
                if (unidad[j + 1] > unidad[j]) {
                    int aux;
                    aux = unidad[j + 1];
                    unidad[j + 1] = unidad[j];
                    unidad[j] = aux;
                }
            }
        }
        for (int i = 0;i<unidad.length;i++){
            System.out.println(unidad[i]);
        }
    }

}


