package br.com.projeto.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.crud.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
    
}
