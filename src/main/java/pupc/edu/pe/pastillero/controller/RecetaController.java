package pupc.edu.pe.pastillero.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pupc.edu.pe.pastillero.dto.ApplicantResponse;
import pupc.edu.pe.pastillero.dto.request.RecetaRequest;
import pupc.edu.pe.pastillero.dto.response.RecetasResponse;
import pupc.edu.pe.pastillero.service.RecetaService;

@RestController
@RequestMapping("/v1/api/receta")
public class RecetaController {

    @Autowired
    RecetaService recetaService;

    @PostMapping
    @Operation(summary = "Crear una receta nueva")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Receta creada"),
            @ApiResponse(responseCode = "400", description = "Receta no creada"),
    })
    ApplicantResponse crearReceta(@RequestBody RecetaRequest request){
        return recetaService.crearReceta(request, "user1");
    }

    @GetMapping
    @Operation(summary = "Obtener las recetas")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Recetas encontradas"),
            @ApiResponse(responseCode = "404", description = "Recetas no encontradas"),
    })
    RecetasResponse recetas(){
        return recetaService.verRecetas("user1");
    }

    @PutMapping
    @Operation(summary = "Actualizar las recetas de un usuario")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Receta editada"),
            @ApiResponse(responseCode = "400", description = "Recetas no se puede editar"),
    })
    ApplicantResponse editarReceta(@RequestBody RecetaRequest request){
        return recetaService.editarReceta(request, "user1");
    }

    @DeleteMapping(value = "/{recetaId}")
    @Operation(summary = "Eliminar una receta")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Receta eliminada"),
            @ApiResponse(responseCode = "400", description = "Recetas no se eliminar"),
    })
    ApplicantResponse eliminarReceta(@PathVariable String recetaId){
        return recetaService.eliminarReceta(recetaId, "user1");
    }
}
