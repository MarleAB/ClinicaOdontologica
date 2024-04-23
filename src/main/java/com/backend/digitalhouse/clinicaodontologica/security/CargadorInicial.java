package com.backend.digitalhouse.clinicaodontologica.security;

import com.backend.digitalhouse.clinicaodontologica.entity.Usuario;
import com.backend.digitalhouse.clinicaodontologica.entity.UsuarioRole;
import com.backend.digitalhouse.clinicaodontologica.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class CargadorInicial implements ApplicationRunner {

    private UsuarioRepository usuarioRepository;

    @Autowired
    public CargadorInicial(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        BCryptPasswordEncoder cifrador= new BCryptPasswordEncoder();
        String clave= cifrador.encode("digital");
        String clave2= cifrador.encode("digital2");
        System.out.println("CLAVE CIFRADA: "+cifrador);


        Usuario usuario1= new Usuario("Marle","Maria","marle.aprendiendo@digitalhouse.com",clave, UsuarioRole.ROLE_USER);
        Usuario usuario2= new Usuario("Marle2","Maria2","marle2.aprendiendo@digitalhouse.com",clave2, UsuarioRole.ROLE_USER);
        usuarioRepository.save(usuario1);
        usuarioRepository.save(usuario2);

    }
}
