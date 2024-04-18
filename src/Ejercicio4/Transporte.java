package Ejercicio4;

public enum Transporte {
    BUS(15,"A gasolina") {
        @Override
        public String mostrarDescripcion() {
            return "Bus rojo";
        }
    },
    TREN(45,"A vapor") {
        @Override
        public String mostrarDescripcion() {
            return "Tren azul";
        }
    },
    BARCO(60,"A vapor") {
        @Override
        public String mostrarDescripcion() {
            return "Barco rojo con blanco";
        }
    },
    MOTO(2,"A gasolina") {
        @Override
        public String mostrarDescripcion() {
            return "Moto negra";
        }
    },
    AVION(75,"A gasolina") {
        @Override
        public String mostrarDescripcion() {
            return "Avion blanco";
        }
    };

    private int capacidad;
    private String tipoMotor;

    public int getCapacidad() {
        return capacidad;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    Transporte(int capacidad, String tipoMotor) {
        this.capacidad = capacidad;
        this.tipoMotor = tipoMotor;
    }
    public abstract String mostrarDescripcion();

}
