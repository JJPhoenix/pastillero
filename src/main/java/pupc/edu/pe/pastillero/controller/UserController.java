package pupc.edu.pe.pastillero.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pupc.edu.pe.pastillero.dto.request.LoginRequest;
import pupc.edu.pe.pastillero.dto.request.UserRequest;
import pupc.edu.pe.pastillero.dto.response.LoginResponse;
import pupc.edu.pe.pastillero.dto.response.PacienteResponse;
import pupc.edu.pe.pastillero.dto.response.UserResponse;
import pupc.edu.pe.pastillero.service.UserService;

@RestController
@RequestMapping("/v1/api/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/login")
    @Operation(summary = "Autenticacion de usuario")
    public LoginResponse login(@RequestBody LoginRequest loginRequest){
        return service.login(loginRequest);
    }

    @PostMapping
    @Operation(summary = "Registro de usuario")
    public UserResponse registro(@RequestBody UserRequest userRequest){
        return service.crearUser(userRequest);
    }

    @GetMapping
    @Operation(summary = "Ver usuario")
    public PacienteResponse buscarUsuario(@RequestBody String usuario){
        return null;
    }

    @PutMapping
    @Operation(summary = "Editar usuario")
    public UserResponse editar(@RequestBody UserRequest userRequest){
        return service.editarUser(userRequest);
    }
}
