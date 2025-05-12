package com.example.proyectbiknect.Usuario.domain;

// === Usuario ===

// hay que cambiarlo para que sea de security

// OMENTARIO A VER QU EPAAAAAAAAAAAAA DEEPSEK AYUDA

import com.example.proyectbiknect.Estadistica.domain.Estadistica;
import com.example.proyectbiknect.SocialProfile.domain.PerfilSocial;
import jakarta.persistence.*;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private PerfilSocial perfilSocial;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Estadistica estadistica;
}