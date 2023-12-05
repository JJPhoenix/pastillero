package pupc.edu.pe.pastillero.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuario autenticado"),
            @ApiResponse(responseCode = "401", description = "Usuario no autorizado")
    })
    public LoginResponse login(@RequestBody LoginRequest loginRequest){
        return service.login(loginRequest);
    }

    @PostMapping
    @Operation(summary = "Registro de usuario")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuario registrado"),
            @ApiResponse(responseCode = "400", description = "Error al registrar")
    })
    public UserResponse registro(@RequestBody UserRequest userRequest){
        return service.crearUser(userRequest);
    }

    @GetMapping
    @Operation(summary = "Ver usuario")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuario encontrado"),
            @ApiResponse(responseCode = "404", description = "Usuario no encontrado")
    })
    public PacienteResponse buscarUsuario(@RequestBody String usuario){
        return null;
    }

    @PutMapping
    @Operation(summary = "Editar usuario")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuario editado"),
            @ApiResponse(responseCode = "403", description = "Usuario no se puede editar"),
            @ApiResponse(responseCode = "404", description = "Usuario no encontrado"),
    })
    public UserResponse editar(@RequestBody UserRequest userRequest){
        return service.editarUser(userRequest);
    }
}
