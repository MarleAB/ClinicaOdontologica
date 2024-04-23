package com.backend.digitalhouse.clinicaodontologica.service;

import com.backend.digitalhouse.clinicaodontologica.entity.Usuario;
import com.backend.digitalhouse.clinicaodontologica.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService implements UserDetailsService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Usuario> usuarioBuscado= usuarioRepository.findByEmail(email);
        if(usuarioBuscado.isPresent()){
            return usuarioBuscado.get();
        }else{
            throw new UsernameNotFoundException("No se encontro el usuario con el correo suministrado");
        }

    }
}
