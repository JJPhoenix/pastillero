package pupc.edu.pe.pastillero.service;

import pupc.edu.pe.pastillero.dto.ApplicantResponse;
import pupc.edu.pe.pastillero.dto.request.MedicamentoRequest;
import pupc.edu.pe.pastillero.dto.response.MedicamentoListResponse;

public interface FarmaciaService {
    MedicamentoListResponse buscarFarmacia(String request);
    ApplicantResponse registrarFarmacia(MedicamentoRequest request);
}
