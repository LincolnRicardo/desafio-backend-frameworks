package com.lincolnricardo.Javaspringboot.repositories;



import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.lincolnricardo.Javaspringboot.models.Usuario;



@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {


}