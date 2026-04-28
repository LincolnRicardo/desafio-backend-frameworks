package com.lincolnricardo.Javaspringboot.services.interfaces;



import java.util.List;

import com.lincolnricardo.Javaspringboot.dtos.UsuarioDto;



public interface UsuarioServiceInterface {
 
  UsuarioDto salvar(UsuarioDto user);

  List<UsuarioDto> listar();

}