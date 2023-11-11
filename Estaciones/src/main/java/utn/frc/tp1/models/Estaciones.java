package utn.frc.tp1.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "Estaciones")
@Data
public class Estaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    @Column(name = "FECHA_HORA_CREACION", nullable = false)
    private String fecha_hora_creacion;

    @Column(name = "LATITUD", nullable = false)
    private double latitud;

    @Column(name = "LONGITUD", nullable = false)
    private double longitud;
}
