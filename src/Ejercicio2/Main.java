package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        ServicioPeluqueria servicio1 = ServicioPeluqueria.TINTE;
        System.out.println("El tinte " + servicio1.getNombre() + " es " +servicio1.mostrarDescripcionServicio()+ " y cuesta " +servicio1.getPrecio());

        ServicioPeluqueria servicio2 = ServicioPeluqueria.UÑAS;
        System.out.println("Las uñas " + servicio2.getNombre() + " son " +servicio2.mostrarDescripcionServicio()+ " y cuestan " +servicio2.getPrecio());
    }

}
