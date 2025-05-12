package com.example.proyectbiknect.Ruta.domain;

import com.example.proyectbiknect.Evento.domain.Evento;
import com.example.proyectbiknect.Reseña.domain.Reseña;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Ruta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "ruta")
    private List<Reseña> reseñas;

    @OneToMany(mappedBy = "ruta")
    private List<Evento> eventos;
}