package pupc.edu.pe.pastillero.service;

import org.springframework.stereotype.Service;
import pupc.edu.pe.pastillero.dto.request.MedicamentoRequest;
import pupc.edu.pe.pastillero.dto.response.MedicamentoListResponse;

@Service
public class FarmaciaServiceImpl implements FarmaciaService{
    @Override
    public MedicamentoListResponse buscarFarmacia(MedicamentoRequest request) {
        return null;
    }
}
