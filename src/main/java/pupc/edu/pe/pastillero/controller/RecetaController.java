package pupc.edu.pe.pastillero.controller;

import io.swagger.v3.oas.annotations.Operation;
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
    ApplicantResponse crearReceta(@RequestBody RecetaRequest request){
        return recetaService.crearReceta(request, "user1");
    }

    @GetMapping
    @Operation(summary = "Obtener las recetas")
    RecetasResponse recetas(){
        return recetaService.verRecetas("user1");
    }

    @PutMapping
    @Operation(summary = "Actualizar las recetas de un usuario")
    ApplicantResponse editarReceta(@RequestBody RecetaRequest request){
        return recetaService.editarReceta(request, "user1");
    }

    @DeleteMapping(value = "/{recetaId}")
    @Operation(summary = "Eliminar una receta")
    ApplicantResponse eliminarReceta(@PathVariable String recetaId){
        return recetaService.eliminarReceta(recetaId, "user1");
    }
}
