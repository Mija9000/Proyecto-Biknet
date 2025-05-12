package com.example.proyectbiknect.Evento.domain;

import com.example.proyectbiknect.Ruta.domain.Ruta;
import jakarta.persistence.*;

@Entity
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ruta_id")
    private Ruta ruta;
}