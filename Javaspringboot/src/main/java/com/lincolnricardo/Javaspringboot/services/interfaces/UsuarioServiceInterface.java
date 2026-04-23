package com.lincolnricardo.java_springboot.services.interfaces;



import java.util.List;

import com.lincolnricardo.java_springboot.dtos.UsuarioDto;



public interface UsuarioServiceInterface {
 
  UsuarioDto salvar(UsuarioDto user);

  List<UsuarioDto> listar();

}