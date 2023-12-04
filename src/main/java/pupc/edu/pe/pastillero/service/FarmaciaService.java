package pupc.edu.pe.pastillero.service;

import pupc.edu.pe.pastillero.dto.request.MedicamentoRequest;
import pupc.edu.pe.pastillero.dto.response.MedicamentoListResponse;

public interface FarmaciaService {
    MedicamentoListResponse buscarFarmacia(MedicamentoRequest request);
}
