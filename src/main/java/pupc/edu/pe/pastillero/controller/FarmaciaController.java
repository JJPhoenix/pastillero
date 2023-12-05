package pupc.edu.pe.pastillero.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pupc.edu.pe.pastillero.dto.ApplicantResponse;
import pupc.edu.pe.pastillero.dto.request.MedicamentoRequest;
import pupc.edu.pe.pastillero.dto.response.MedicamentoListResponse;
import pupc.edu.pe.pastillero.service.FarmaciaService;

@RestController
@RequestMapping("/v1/api/farmacia")
@Tag(name = "Medicamentos", description = "Endpoints para gestionar medicamentos.")
public class FarmaciaController {

    @Autowired
    FarmaciaService service;

    @GetMapping("/{recetaLabel}")
    @Operation(summary = "Buscar producto")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Producto encontrado"),
            @ApiResponse(responseCode = "404", description = "Producto no encontrado",content = @Content),
    })
    public MedicamentoListResponse buscar(@PathVariable String recetaLabel){
        return service.buscarFarmacia(recetaLabel);
    }

    @PostMapping
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Producto registrado"),
            @ApiResponse(responseCode = "403", description = "Acceso no permitido para registrar",content = @Content),
            @ApiResponse(responseCode = "404", description = "Producto no se puede registrar",content = @Content),
    })
    @Operation(summary = "Registrar producto")
    public ApplicantResponse registrar(@RequestBody MedicamentoRequest request){
        return service.registrarFarmacia(request);
    }
}
