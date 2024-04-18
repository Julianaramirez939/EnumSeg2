package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Transporte transporte1 = Transporte.MOTO;
        System.out.println("La moto es una " +transporte1.mostrarDescripcion()+ " con una capacidad de " +transporte1.getCapacidad()+ " Personas y un motor " +transporte1.getTipoMotor());
    }
}
