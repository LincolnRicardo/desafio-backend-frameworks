@RestController
@RequestMapping("api/usuarios")
public class UsuarioController {

  @Autowired
  private UsuarioServiceInterface usuarioService;

  @PostMapping
  public ResponseEntity<?> registrarUsuario(@Valid UsuarioDto u, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      return ResponseEntity.badRequest().body(bindingResult.getAllErrors());
    }

    UsuarioDto salvo = usuarioService.salvar(u);
    return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
  }

  @GetMapping
  public ResponseEntity<java.util.List<?>> listarUsuarios() {
    java.util.List<UsuarioDto> listarUsuarios = usuarioService.listar();
    return ResponseEntity.ok(listarUsuarios);
  }
}