package pupc.edu.pe.pastillero.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import pupc.edu.pe.pastillero.dto.ApplicantResponse;
import pupc.edu.pe.pastillero.dto.request.SeguimientoRequest;

@RestController
@RequestMapping("/v1/api/seguimento")
@Tag(name = "Seguimiento", description = "Endpoints para gestionar los seguimientos de recetas.")
public class SeguimientoController {

    @PostMapping
    @Operation(summary = "Relacionar un usuario con alguna receta")
    @Parameter(in= ParameterIn.HEADER, description = "Authorization token", name = "X-Auth-Token")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Receta asociada a usuario"),
            @ApiResponse(responseCode = "400", description = "Recetas no asociada",content = @Content),
    })
    ApplicantResponse relacionarUsuario(@RequestBody SeguimientoRequest request){
        return null;
    }
}
