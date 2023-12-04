package pupc.edu.pe.pastillero.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;
import pupc.edu.pe.pastillero.dto.ApplicantResponse;
import pupc.edu.pe.pastillero.dto.request.SeguimientoRequest;

@RestController
@RequestMapping("/v1/api/user/seguimento")
public class SeguimientoController {

    @PostMapping
    @Operation(summary = "Relacionar un usuario con alguna receta")
    ApplicantResponse relacionarUsuario(@RequestBody SeguimientoRequest request){
        return null;
    }
}
