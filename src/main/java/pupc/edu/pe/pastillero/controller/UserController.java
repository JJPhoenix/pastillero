package pupc.edu.pe.pastillero.controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name = "User", description = "Endpoints para operaciones relacionado con la gestion de usuarios.")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/login")
    @Operation(summary = "Autenticacion de usuario")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuario autenticado"),
            @ApiResponse(responseCode = "401", description = "Usuario no autorizado", content = @Content)
    })
    public LoginResponse login(@RequestBody LoginRequest loginRequest){
        return service.login(loginRequest);
    }

    @PostMapping
    @Operation(summary = "Registro de usuario")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuario registrado"),
            @ApiResponse(responseCode = "400", description = "Error al registrar", content = @Content)
    })
    public UserResponse registro(@RequestBody UserRequest userRequest){
        return service.crearUser(userRequest);
    }

    @GetMapping("/{usuario}")
    @Operation(summary = "Ver usuario")
    @Parameter(in= ParameterIn.HEADER, description = "Authorization token", name = "X-Auth-Token")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuario encontrado"),
            @ApiResponse(responseCode = "404", description = "Usuario no encontrado", content = @Content)
    })
    public PacienteResponse buscarUsuario(@PathVariable String usuario){
        return null;
    }

    @PutMapping
    @Operation(summary = "Editar usuario")
    @Parameter(in= ParameterIn.HEADER, description = "Authorization token", name = "X-Auth-Token")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuario editado"),
            @ApiResponse(responseCode = "403", description = "Usuario no se puede editar", content = @Content),
            @ApiResponse(responseCode = "404", description = "Usuario no encontrado", content = @Content),
    })
    public UserResponse editar(@RequestBody UserRequest userRequest){
        return service.editarUser(userRequest);
    }
}
