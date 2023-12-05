package pupc.edu.pe.pastillero.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;
import pupc.edu.pe.pastillero.dto.ApplicantResponse;
import pupc.edu.pe.pastillero.dto.request.SeguimientoRequest;

@RestController
@RequestMapping("/v1/api/user/seguimento")
public class SeguimientoController {

    @PostMapping
    @Operation(summary = "Relacionar un usuario con alguna receta")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Receta asociada a usuario"),
            @ApiResponse(responseCode = "400", description = "Recetas no asociada"),
    })
    ApplicantResponse relacionarUsuario(@RequestBody SeguimientoRequest request){
        return null;
    }
}
