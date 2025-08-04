package vacunas;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Vacuna {
    private LocalDate fechaAplicacion;
    private LocalDate fechaCreacion;
    private int numeroDeLote;
    private int numeroFabricacion;
    private String nombreComercial;

    public Vacuna() {
        this.fechaAplicacion = LocalDate.now();
        this.fechaCreacion = LocalDate.now();
        this.numeroDeLote = 123;
        this.numeroFabricacion = 123;
        this.nombreComercial = "carlos";
    }

    public Vacuna(LocalDate fechaAplicacion, LocalDate fechaCreacion, int numeroDeLote, int numeroFabricacion, String nombreComercial) {
        this.fechaAplicacion = fechaAplicacion;
        this.fechaCreacion = fechaCreacion;
        this.numeroDeLote = numeroDeLote;
        this.numeroFabricacion = numeroFabricacion;
        this.nombreComercial = nombreComercial;
    }
}
