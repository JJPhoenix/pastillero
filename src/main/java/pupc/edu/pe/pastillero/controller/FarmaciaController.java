package pupc.edu.pe.pastillero.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pupc.edu.pe.pastillero.dto.request.MedicamentoRequest;
import pupc.edu.pe.pastillero.dto.response.MedicamentoListResponse;
import pupc.edu.pe.pastillero.service.FarmaciaService;

@RestController
@RequestMapping("/v1/api/farmacia")
public class FarmaciaController {

    @Autowired
    FarmaciaService service;

    @GetMapping
    @Operation(summary = "Buscar producto")
    public MedicamentoListResponse buscar(@RequestBody MedicamentoRequest request){
        return service.buscarFarmacia(request);
    }
}
