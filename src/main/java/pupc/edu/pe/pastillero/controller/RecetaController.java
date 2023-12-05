package pupc.edu.pe.pastillero.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pupc.edu.pe.pastillero.dto.ApplicantResponse;
import pupc.edu.pe.pastillero.dto.request.RecetaRequest;
import pupc.edu.pe.pastillero.dto.response.RecetasResponse;
import pupc.edu.pe.pastillero.service.RecetaService;

@RestController
@RequestMapping("/v1/api/receta")
@Tag(name = "Recetas", description = "Endpoints para gestionar las recetas de cada usuario.")
public class RecetaController {

    @Autowired
    RecetaService recetaService;

    @PostMapping
    @Operation(summary = "Crear una receta nueva")
    @Parameter(in= ParameterIn.HEADER, description = "Authorization token", name = "X-Auth-Token")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Receta creada"),
            @ApiResponse(responseCode = "400", description = "Receta no creada",content = @Content),
    })
    ApplicantResponse crearReceta(@RequestBody RecetaRequest request){
        return recetaService.crearReceta(request, "user1");
    }

    @GetMapping
    @Operation(summary = "Obtener las recetas")
    @Parameter(in= ParameterIn.HEADER, description = "Authorization token", name = "X-Auth-Token")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Recetas encontradas"),
            @ApiResponse(responseCode = "404", description = "Recetas no encontradas",content = @Content),
    })
    RecetasResponse recetas(){
        return recetaService.verRecetas("user1");
    }

    @PutMapping
    @Operation(summary = "Actualizar las recetas de un usuario")
    @Parameter(in= ParameterIn.HEADER, description = "Authorization token", name = "X-Auth-Token")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Receta editada"),
            @ApiResponse(responseCode = "400", description = "Recetas no se puede editar",content = @Content),
    })
    ApplicantResponse editarReceta(@RequestBody RecetaRequest request){
        return recetaService.editarReceta(request, "user1");
    }

    @DeleteMapping(value = "/{recetaId}")
    @Operation(summary = "Eliminar una receta")
    @Parameter(in= ParameterIn.HEADER, description = "Authorization token", name = "X-Auth-Token")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Receta eliminada"),
            @ApiResponse(responseCode = "400", description = "Recetas no se eliminar",content = @Content),
    })
    ApplicantResponse eliminarReceta(@PathVariable String recetaId){
        return recetaService.eliminarReceta(recetaId, "user1");
    }
}
