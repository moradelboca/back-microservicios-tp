package utn.frc.tp1.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "Alquileres")
@Data
public class Alquileres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "ID_CLIENTE", nullable = false)
    private long id_cliente;

    @Column(name = "ESTADO", nullable = false)
    private boolean estado;

    @Column(name = "ESTACION_RETIRO", nullable = false)
    private long estacion_retiro;

    @Column(name = "ESTACION_DEVOLUCION", nullable = false)
    private long estacion_devolucion;

    @Column(name = "FECHA_HORA_RETIRO", nullable = false)
    private String fecha_hora_retiro;

    @Column(name = "FECHA_HORA_DEVOLUCION", nullable = false)
    private String fecha_hora_devolucion;

    @Column(name = "MONTO", nullable = false)
    private double monto;

    @Column(name = "ID_TARIFA", nullable = false)
    private long id_tarifa;
}
