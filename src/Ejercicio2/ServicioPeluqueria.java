package Ejercicio2;

public enum ServicioPeluqueria {
    CORTE("corto","Corte de pelo hasta los hombros",30000) {
        @Override
        public String mostrarDescripcionServicio() {
            return CORTE.getDescripcion();
        }
    },
    UÑAS("semipermanentes","uñas cortas color negro",50000) {
        @Override
        public String mostrarDescripcionServicio() {
            return UÑAS.getDescripcion();
        }
    },
    TINTE("Sephora","Tinte color azul",14000) {
        @Override
        public String mostrarDescripcionServicio() {
            return TINTE.getDescripcion();
        }
    };


    private String nombre;
    private String descripcion;
    private int precio;

    public int getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    ServicioPeluqueria(String nombre, String descripcion, int precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    public abstract String mostrarDescripcionServicio();
}
