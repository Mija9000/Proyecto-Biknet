package com.example.proyectbiknect.SocialProfile.infrastructure;

import com.example.proyectbiknect.SocialProfile.domain.PerfilSocial;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PerfilSocialRepository extends JpaRepository<PerfilSocial, Long> {
}