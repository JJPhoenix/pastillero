package pupc.edu.pe.pastillero.service;

import org.springframework.stereotype.Service;
import pupc.edu.pe.pastillero.dto.ApplicantResponse;
import pupc.edu.pe.pastillero.dto.request.RecetaRequest;
import pupc.edu.pe.pastillero.dto.response.RecetasResponse;

@Service
public class RecetaServiceImpl implements RecetaService{

    @Override
    public ApplicantResponse crearReceta(RecetaRequest request, String idUser) {
        ApplicantResponse response = new ApplicantResponse();
        return response;
    }

    @Override
    public ApplicantResponse editarReceta(RecetaRequest request, String idUser) {
        ApplicantResponse response = new ApplicantResponse();
        return response;
    }

    @Override
    public ApplicantResponse eliminarReceta(String request, String idUser) {
        ApplicantResponse response = new ApplicantResponse();
        return response;
    }

    @Override
    public RecetasResponse verRecetas(String idUser) {
        return null;
    }
}
