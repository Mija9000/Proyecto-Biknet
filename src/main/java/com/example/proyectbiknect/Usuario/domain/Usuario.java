package com.example.proyectbiknect.Usuario.domain;

// === Usuario ===

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