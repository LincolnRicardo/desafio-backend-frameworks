@Override
public UsuarioDto salvar(UsuarioDto dto) {

    Usuario usuario = new Usuario();

    usuario.setNomeCompleto(dto.nomeCompleto());
    usuario.setCpf(dto.cpf());
    usuario.setAnoNasc(dto.anoNasc());

    Usuario usuarioSalvo = usuarioRepository.save(usuario);

    return new UsuarioDto(
        usuarioSalvo.getId(),
        usuarioSalvo.getNomeCompleto(),
        usuarioSalvo.getCpf(),
        usuarioSalvo.getAnoNasc()
    );
}