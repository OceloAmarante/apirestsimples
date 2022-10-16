package com.oceloamarante.apiRestSimple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oceloamarante.apiRestSimple.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
