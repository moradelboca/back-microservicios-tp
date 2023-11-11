package utn.frc.tp1.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "Tarifa")
@Data
public class Tarifa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "TIPO_TARIFA", nullable = false)
    private int tipo_tarifa;

    @Column(name = "DEFINICION", nullable = false)
    private String definicion;

    @Column(name = "DIA_SEMANA", nullable = false)
    private int dia_semana;

    @Column(name = "DIA_MES", nullable = false)
    private int dia_mes;

    @Column(name = "MES", nullable = false)
    private int mes;

    @Column(name = "ANIO", nullable = false)
    private int anio;

    @Column(name = "MONTO_FIJO_ALQUILER", nullable = false)
    private double monto_fijo_alquiler;

    @Column(name = "MONTO_MINUTO_FRACCION", nullable = false)
    private double monto_minuto_fraccion;

    @Column(name = "MONTO_HORA", nullable = false)
    private double monto_hora;

    @Column(name = "MONTO_KM", nullable = false)
    private double monto_km;
}
