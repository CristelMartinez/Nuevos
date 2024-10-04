package com.tesji.apidraftesji.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// JPA utiliza esta clase para convertirla a una tabla en la base de datos
@Entity
public class DatosApiDraft {
    // Definir los atributos (seran los campos de la tabla)
    @Id //Convierte en una pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Es auto incrementable
    private long id;
    private String nombreJugador;
    private String equipoActual;
    private double costoCarta;

    public DatosApiDraft() {

    }

    public DatosApiDraft(String nombreJugador, String equipoActual, double costoCarta) {
        this.nombreJugador = nombreJugador;
        this.equipoActual = equipoActual;
        this.costoCarta = costoCarta;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getEquipoActual() {
        return equipoActual;
    }

    public void setEquipoActual(String equipoActual) {
        this.equipoActual = equipoActual;
    }

    public double getCostoCarta() {
        return costoCarta;
    }

    public void setCostoCarta(double costoCarta) {
        this.costoCarta = costoCarta;
    }

}

